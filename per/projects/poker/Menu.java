package per.projects.poker;
import per.projects.poker.Player;
import java.util.Scanner;

public class Menu {
    Player[] players = new Player[8];
    Table table = new Table();
    Carta[] cartas = Carta.generateDeck();
    
    public Menu(){}
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
