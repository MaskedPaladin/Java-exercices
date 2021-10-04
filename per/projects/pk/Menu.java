package per.projects.pk;

import java.util.Scanner;

public class Menu {
    /* Menu class variables */

    /* Menu class constructors */
    Menu(){}
    /* Menu class setters */
    
    /* Menu class getters */

    /* Menu class functions */
    public void printMainMenuOptions(){
        System.out.println("1) Play");
        System.out.println("2) Config");
        System.out.println("3) Print table info");
        System.out.print("ACTION: ");
    }
    public Table mainMenu(Table table){
        Scanner sc = new Scanner(System.in);
        try{
            if(table.getPlayerQuantity()!=0 && table.getPlayers()!=null){
                printMainMenuOptions();
                int option = sc.nextInt();
                if(option==1){ play(table); }
                else if(option==2){ configMenu(table); }
                else if(option==3){ System.out.println("Max bet: "+table.getMaxBet()+" | Player quantity: "+table.getPlayerQuantity()); }
                else if(option==4){ System.exit(0); }
                else{ mainMenu(table); }
            }
            else{ configMenu(table); }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return table;
    }
    public void printConfigMenuOptions(){
        System.out.println("1) Max Bet");
        System.out.println("2) Player Quantity");
        System.out.println("3) Return");
        System.out.print("ACTION: ");
    }
    public Table configMenu(Table table){
        Scanner sc = new Scanner(System.in);
        try{
            printConfigMenuOptions();
            int option = sc.nextInt();
            if(option==1){
                System.out.print("Set max bet: ");
                int max_bet = sc.nextInt();
                table.setMaxBet(max_bet);
            }
            if(option==2){
                System.out.print("Set player quantity: ");
                int player_quantity = sc.nextInt();
                if(player_quantity<=8){ table.setPlayerQuantity(player_quantity); }
                else{ System.out.println("Max players to set is 8"); configMenu(table); }
            }
            if(option==3){ mainMenu(table); }
            else{ configMenu(table); }
        }
        catch(Exception e){ e.printStackTrace(); }
        return table;
    }
    public Table play(Table table){
        while(table.getPlayers()[0].getStack()>0 && table.hasPlayers()){
            
        }

        return table; 
    }
}
