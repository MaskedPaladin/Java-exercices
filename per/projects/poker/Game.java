package per.projects.poker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
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
            mano[0].setShowedOff();
            j++;
            mano[1]=cartas[j];
            mano[0].setShowedOff();
            j++;
            players[i].setCartas(mano);
        }
        return players;
    }
    public static void play(Player[] players, Table table, Carta[] cartas){
        Carta[] cartasShuffled = shuffle(cartas);
        players = share(players, cartasShuffled);
        while(players[0].hasMoney()){
            for(int i = table.getRound();i<=3;i++){
                if(i==1){ table.setFlop(new Carta[] {cartasShuffled[17], cartasShuffled[18], cartasShuffled[19]});}
                if(i==2){ table.setTurn(cartasShuffled[20]); }
                if(i==3){ table.setRiver(cartasShuffled[21]); }
                table.setActualBet(0);
                table.setRound(i);
                if(table.getRound() == 3){
                    table.setRound(0);
                }
                for(Player p : players){
                    table = Menu.playRound(p, table);
                    for(Carta c : p.getCartas()){
                        if(c.getShowed()){
                            c.setShowedOff();
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.mainMenu();
    }
}
