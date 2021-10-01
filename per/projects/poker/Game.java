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
                for(Player p : players){
                    table = playRound(p, table);
                    for(Carta c : p.getCartas()){
                        if(c.getShowed()){
                            c.setShowedOff();
                        }
                    }
                }
                table.setActualBet(0);
                table.setRound(i);
            }
        }
    }
    public static Table playRound(Player player, Table table){
        Scanner sc = new Scanner(System.in);
        if(table.getActualBet()==0 && player.hasMoney() && player.getFolded()==false){
            System.out.println(player.getName());
            System.out.println(player.getMoney());
            System.out.println(player.getHand());
            System.out.println("1) Bet");
            System.out.println("2) Check");
            System.out.println("3) Toggle cards");
            switch(table.getRound()){
                case 0: System.out.println("Pre flop");
                case 1: System.out.println("Flop");
                case 2: System.out.println("Turn");
                case 3: System.out.println("River");
            }
            System.out.print("Action --> ");
            int option = sc.nextInt();
            if(option==1){
                System.out.print("Bet quantity --> ");
                int quantity = sc.nextInt();
                if(table.getMaxBet()<=0 && quantity<=player.getMoney() && player.getMoney()>0){
                    player.bet(quantity);
                    table.setActualBet(quantity);
                    table.setPot(quantity);
                }
                else{
                    System.out.println("Max bet is "+table.getMaxBet());
                    playRound(player, table);
                }
            }
            if(option==2){
                System.out.println("You checked.");
            }
            if(option==3){
                player.toggleCartas();
                playRound(player, table);
            }
        }
        else if(table.getActualBet()>0 && player.hasMoney() && player.getFolded()==false){
            System.out.println(player.getName());
            System.out.println(player.getMoney());
            System.out.println(player.getHand());
            System.out.println("1) Bet");
            System.out.println("2) Call");
            System.out.println("3) Fold");
            System.out.println("4) Toggle cards");
            switch(table.getRound()){
                case 0: System.out.println("Pre flop");
                case 1: System.out.println("Flop");
                case 2: System.out.println("Turn");
                case 3: System.out.println("River");
            }
            System.out.println("Pot: "+table.getPot());
            System.out.println("Actual bet: "+table.getActualBet());
            System.out.print("Action --> ");
            int option = sc.nextInt();
            if(option==1){
                System.out.print("Bet quantity --> ");
                int quantity = sc.nextInt();
                if(table.getMaxBet()<=0 && quantity<=player.getMoney() && quantity>0 && quantity>=table.getActualBet()){
                    player.bet(quantity);
                    table.setActualBet(quantity);
                    table.setPot(quantity);
                }
                else{
                    System.out.println("Max bet is "+table.getMaxBet());
                    System.out.println("Actual bet: "+table.getActualBet());
                    playRound(player, table);
                }
            }
            if(option==2){
                player.bet(table.getActualBet());
                table.setActualBet(table.getActualBet());
                table.setPot(table.getActualBet());
            }
            if(option==3){
                player.setFoldedOn();
            }
            if(option==4){
                player.toggleCartas();
                playRound(player, table);
            }
            Carta [] showedOff = new Carta[2];
            showedOff = player.getCartas();
            for(Carta c : showedOff){
                c.setShowedOff();
            }
            player.setCartas(showedOff);
        }
        return table;
    }
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.mainMenu();
    }
}
