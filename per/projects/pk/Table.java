package per.projects.pk;

public class Table {
    /* Table class variables */
    private Card[] tableCards = new Card[5];
    private int round;
    private int pot;
    private int actual_bet;
    private int max_bet;
    private int player_quantity = 0;
    private Player[] players = new Player[player_quantity];

    /* Table class constructors */
    Table(){}

    /* Table class setters */
    public void setTableCards(int position, Card card){
        this.tableCards[position]=card;
    }
    public void setRound(int round){
        this.round=round;
    }
    public void setPot(int pot){
        this.pot=pot;
    }
    public void setActualBet(int actual_bet){
        this.actual_bet=actual_bet;
    }
    public void setMaxBet(int max_bet){
        this.max_bet=max_bet;
    }
    public void setPlayerQuantity(int player_quantity){
        this.player_quantity=player_quantity;
    }
    public void setPlayers(Player[] player_quantity){
        for(int i = 0; i<=players.length;i++){
            this.players[i]=player_quantity[i];
        }
    }

    /* Table class getters */
    public Card[] getTableCards(){
        return this.tableCards;
    }
    public int getRound(){
        return this.round;
    }
    public int getPot(){
        return this.pot;
    }
    public int getActualBet(){
        return this.actual_bet;
    }
    public int getMaxBet(){
        return this.max_bet;
    }
    public int getPlayerQuantity(){
        return this.player_quantity;
    }
    public Player[] getPlayers(){
        return this.players;
    }

    /* Table class methods */
    public Boolean hasPlayers(){
        Boolean hasPlayers;
        int playersOut = 0;
            for(Player p : this.players){
                if(p.getStack()<=0){
                    playersOut++;
                }
            }
            if(playersOut>=this.player_quantity-1){
                hasPlayers=false;
            }
            else{
                hasPlayers=true;
            }
            return hasPlayers;
    }
}

