package per.projects.poker;
import per.projects.poker.Player;
import java.util.Scanner;

public class Menu {
    Player[] players = new Player[8];
    Table table = new Table();

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
            }
            if(option==2){
                players = createPlayers(createNames(), new int[]{200,200,200,200,200,200,200,200});
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
    public String[] createNames(){
        String[] names = new String[8];
        try{
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i<8;i++){
                System.out.print("Ingrese nombre "+(i+1)+": ");
                names[i]=new String(sc.nextLine());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return names;
    }
    public Player[] createPlayers(String[] name, int[] money){
        Player[] players = new Player[8];
        for(int i = 0; i<name.length;i++){
            players[i] = new Player(name[i], money[i]);
        }
        return players;
    }
}
