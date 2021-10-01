package per.projects.poker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import per.projects.poker.Carta;
import per.projects.poker.Player;
import per.projects.poker.Table;
import per.projects.poker.Menu;


public class Game {
    public static Carta[] shuffle(Carta[] cartas){
        Carta[] cartasArray = cartas;
        List<Carta> cartaList = Arrays.asList(cartasArray);
		Collections.shuffle(cartaList);
		cartaList.toArray(cartasArray);
        return cartasArray;
    }
    public static Player[] share(Player[] players, Carta[] cartas){
        int j = 0;
        for(int i = 0; i<players.length; i++){
            Carta[] mano = new Carta[2];
            mano[0]=cartas[j];
            j++;
            mano[1]=cartas[j];
            j++;
            players[i].setCartas(mano);
        }
        return players;
    }
    public static void play(Player[] players, Table table, Carta[] cartas){
        Carta[] cartasShuffled = shuffle(cartas);
        players = share(players, cartasShuffled);
        for(Player p : players){
            System.out.println(p.getName());
            System.out.println(p.getHand());
        }
        
    }
    public static void playRound(){

    }
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.mainMenu();
    }
}
