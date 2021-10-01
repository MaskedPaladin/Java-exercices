package per.projects.poker;
import per.projects.poker.Carta;
import per.projects.poker.Player;
import per.projects.poker.Table;

public class Table {
    private String name;
    private int STARTER_MONEY;
    private int MAX_BET;
    private int MAX_PLAYERS;
    private int pot = 0;
    private int actual_bet = 0;
    private Boolean finished = false;
    private int round = 0;
    private Player[] players = new Player[MAX_PLAYERS];
    private int playersQuantity;
    private Card[] tableCards = new Card[5];
    public Table(String name, int max_bet, int max_players){
        this.name = name;
        this.MAX_BET = max_bet;
        this.MAX_PLAYERS = max_players;
    }
    public Table(){}
    public void setStarterMoney(int money){
        this.STARTER_MONEY=money;
    }
    public void setFlop(){
        this.
    }
    public int getRound(){
        return this.round;
    }
    public void setRound(int round){
        this.round=round;
    }
    public void setMaxBet(int max_bet){
        this.MAX_BET=max_bet;
    }
    public void setPot(int quantity){
        this.pot=+quantity;
    }
    public void setActualBet(int quantity){
        this.actual_bet+=quantity;
    }
    public int getActualBet(){
        return this.actual_bet;
    }
    public void setPlayerQuantity(int quantity){
        this.playersQuantity = quantity;
    }
    public void setTableName(String name){
        this.name = name;
    }
    public void setFinishedOn(){
        this.finished=true;
    }
    public void setFinishedOff(){
        this.finished=false;
    }
    public Boolean getFinished(){
        return this.finished;
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
