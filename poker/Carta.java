package per.projects.poker;

public class Carta {
    private String symbol;
    private Boolean showed;
    public Carta(String symbol, Boolean showed){
        this.symbol=symbol;
        this.showed=showed;
    }
    public Carta(){}
    public String getSymbol(){
        return this.symbol;
    }
    public void setSymbol(String symbol){
        this.symbol=symbol;
    }
}