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
        if(this.showed){
            return this.symbol;
        }
        return "--";
    }
    public void setSymbol(String symbol){
        this.symbol=symbol;
    }
    public static Carta[] generateDeck(){
        Carta[] cartas = new Carta[52];
        for(int i = 0; i<cartas.length; i++){
            if(i == 0) { cartas[i] = new Carta("AT", false); }
            if(i == 1) { cartas[i] = new Carta("KT", false); }
            if(i == 2) { cartas[i] = new Carta("QT", false); }
            if(i == 3) { cartas[i] = new Carta("JT", false); }
            if(i>3&&i<13){ cartas[i] = new Carta((i-2)+"T", false); }
            if(i == 13) { cartas[i] = new Carta("AP", false); }
            if(i == 14) { cartas[i] = new Carta("KP", false); }
            if(i == 15) { cartas[i] = new Carta("QP", false); }
            if(i == 16) { cartas[i] = new Carta("JP", false); }
            if(i>16&&i<26){ cartas[i] = new Carta((i-15)+"P", false); }
            if(i == 26) { cartas[i] = new Carta("AC", false); }
            if(i == 27) { cartas[i] = new Carta("KC", false); }
            if(i == 28) { cartas[i] = new Carta("QC", false); }
            if(i == 29) { cartas[i] = new Carta("JC", false); }
            if(i>29&&i<39){ cartas[i] = new Carta((i-28)+"C", false); }
            if(i == 39) { cartas[i] = new Carta("AD", false); }
            if(i == 40) { cartas[i] = new Carta("KD", false); }
            if(i == 41) { cartas[i] = new Carta("QD", false); }
            if(i == 42) { cartas[i] = new Carta("JD", false); }
            if(i>42&&i<52){ cartas[i] = new Carta((i-41)+"D", false); }    
        }
        return cartas;
    }
    public Boolean getShowed(){ return this.showed; }
    public void setShowedOff(){ this.showed=false; }
    public void setShowedOn(){ this.showed=true; }
}