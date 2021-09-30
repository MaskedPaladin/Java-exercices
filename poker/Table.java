package per.projects.poker;
import per.projects.poker.Player;

public class Table {
    private String name;
    private int STARTER_MONEY;
    private int MAX_BET;
    private int MAX_PLAYERS;
    private int pot = 0;
    private Player[] players = new Player[MAX_PLAYERS];
    private int playersQuantity;
    public Table(String name, int max_bet, int max_players){
        this.name = name;
        this.MAX_BET = max_bet;
        this.MAX_PLAYERS = max_players;
    }
    public Table(){}
    public void setStarterMoney(int money){
        this.STARTER_MONEY=money;
    }
    public void setMaxBet(int max_bet){
        this.MAX_BET=max_bet;
    }
    public void setPot(int quantity){
        this.pot=quantity;
    }
    public void setPlayerQuantity(int quantity){
        this.playersQuantity = quantity;
    }
    public void setTableName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getMaxBet(){
        return this.MAX_BET;
    }
    public int getMaxPlayers(){
        return this.MAX_PLAYERS;
    }
    public int getPot(){
        return this.pot;
    }
    public Player[] getPlayers(){
        return this.players;
    }
    public int getPlayerQuantity(){
        return this.playersQuantity;
    }
    public void deletePlayer(String name){
        for(int i = 0; i<=this.players.length;i++){
            if(players[i].getName().equals(name)){
                players[i]=null;
            }
        }
    }
}
