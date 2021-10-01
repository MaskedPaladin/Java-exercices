package per.projects.poker;
import per.projects.poker.Carta;

public class Player {
    private String name;
    private int money;
    private Boolean turn;
    private Carta[] cartas = new Carta[2];
    public Player(String name, int money){
        this.name = name;
        this.money = money;
    }
    public Player(){}
    public String getName(){
        return this.name;
    }
    public int getMoney(){
        return this.money;
    }
    public String getHand(){
        String hand = "";
        for(Carta c : this.cartas){
            hand+="|"+c.getSymbol()+"|";
        }
        return hand;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMoney(int money){
        this.money=money;
    }
    public void setCartas(Carta[] cartas){
        this.cartas = cartas;
    }
    public Boolean bet(int quantity){
        this.money-=quantity;
        return true;
    }
    public Boolean check(){
        return true;
    }
    public Boolean fold(){
        return false;
    }
    public Boolean hasMoney(){
        if(this.money<=0){
            return false;
        }
        return true;
    }
}
