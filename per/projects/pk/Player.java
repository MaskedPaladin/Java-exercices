package per.projects.pk;

public class Player {
    /* Player class variables */
    private String name;
    private int stack;
    private Card[] hand = new Card[2];

    /* Player class constructors */
    Player(){}
    
    /* Player class setters */
    public void setName(String name){
        this.name = name;
    }
    public void setStack(int stack){
        this.stack = stack;
    }
    public void setHand(Card[] hand){
        this.hand = hand;
    }

    /* Player class getters */
    public String getName(){
        return this.name;
    }
    public int getStack(){
        return this.stack;
    }
    public Card[] getHand(){
        return this.hand;
    }

}
