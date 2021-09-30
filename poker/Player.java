package per.projects.poker;

public class Player {
    private String name;
    private int money;
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
    public void setName(String name){
        this.name = name;
    }
    public void setMoney(int money){
        this.money=money;
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
}
