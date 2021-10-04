package per.projects.poker;
import per.projects.poker.Player;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Player[] players = new Player[8];
    Table table = new Table();
    Carta[] cartas = Carta.generateDeck();
    
    public Menu(){}
    public static void clearScreen() throws IOException{ 
        for(int i = 0; i<50;i++){
            System.out.println("\n");
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
            if(table.getRound()==0){ System.out.println("Pre flop"); }
            if(table.getRound()==1){ System.out.println("Flop"); }
            if(table.getRound()==2){ System.out.println("Turn"); }
            if(table.getRound()==3){ System.out.println("River"); }
            System.out.println(table.getTableCards());
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
                    try{
                        clearScreen();
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("Max bet is "+table.getMaxBet());
                    playRound(player, table);
                }
            }
            if(option==2){
                try{
                    clearScreen();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println("You checked.");
            }
            if(option==3){
                try{
                    clearScreen();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
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
            if(table.getRound()==0){ System.out.println("Pre flop"); }
            if(table.getRound()==1){ System.out.println("Flop"); }
            if(table.getRound()==2){ System.out.println("Turn"); }
            if(table.getRound()==3){ System.out.println("River"); }
            System.out.println(table.getTableCards());
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
    public void mainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Play");
        System.out.println("2) Edit names");
        System.out.println("3) Edit starter money");
        System.out.println("4) Edit max bet");
        System.out.println("5) Edit table name");
        try{
            int option = sc.nextInt();
            if(option==1){
                try{
                    Game.play(this.players, this.table, this.cartas);
                }
                catch(Exception e){
                    e.printStackTrace();
                    mainMenu();
                }
            }
            if(option==2){
                for(int i = 0; i<players.length;i++){
                    System.out.print((i+1)+" Ingrese nombre: ");
                    String name = sc.next();
                    players[i] = new Player(name, 200);
                    players[i].setFoldedOff();
                }
                mainMenu();
            }
            if(option==3){
                System.out.println("1) Starter money");
                System.out.println("2) Back");
                option = sc.nextInt();
                if(option==1){
                    System.out.print("Starter money: ");
                    option = sc.nextInt();
                    table.setStarterMoney(option);
                    mainMenu();
                }
                else if (option==2){
                    mainMenu();
                }
            }
            if(option==4){
                System.out.println("1) Max bet");
                System.out.println("2) Back");
                option = sc.nextInt();
                if(option==1){
                    System.out.print("Max bet: ");
                    option = sc.nextInt();
                    table.setMaxBet(option);
                    mainMenu();
                }
                else if (option==2){
                    mainMenu();
                }
            }
            if(option==5){
                System.out.print("Table name: ");
                table.setTableName(sc.next());
                mainMenu();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public Player createPlayer(String name, int money){
        Player player = new Player(name, money);
        return player;
    }
}
