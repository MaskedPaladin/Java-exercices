package per.projects.pk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card {
    /* Card class variables*/
    private String symbol;
    private int value;
    private boolean show;
    /* Card class constructors*/
    Card(){}
    Card(String symbol, int value, boolean show){}

    /* Card class setters*/
    public void setSymbol(String symbol){
        this.symbol=symbol;
    }
    public void setValue(int value){
        this.value=value;
    }
    public void setShow(Boolean show){
        this.show=show;
    }
    /* Card class getters*/
    public String getSymbol(String symbol){
        return this.symbol;
    }
    public int getValue(int value){
        return this.value;
    }
    public Boolean getShow(){
        return this.show;
    }
    /* Card class functions*/
    public Card[] generateDeck(){
        Card[] deck = new Card[52];
        int j = 2;
        for(int i = 0; i<deck.length; i++){
            if(i == 0) { deck[i] = new Card("AT", 14, false); }
            if(i == 1) { deck[i] = new Card("KT", 13, false); }
            if(i == 2) { deck[i] = new Card("QT", 12,false); }
            if(i == 3) { deck[i] = new Card("JT", 11, false); }
            if(i>3&&i<13){ deck[i] = new Card((i-2)+"T", j, false); j++;}
            if(i == 13) { deck[i] = new Card("AP", 14, false); j=2;}
            if(i == 14) { deck[i] = new Card("KP", 13, false); }
            if(i == 15) { deck[i] = new Card("QP", 12, false); }
            if(i == 16) { deck[i] = new Card("JP", 11, false); }
            if(i>16&&i<26){ deck[i] = new Card((i-15)+"P", j, false); j++;}
            if(i == 26) { deck[i] = new Card("AC", 14, false); j=2;}
            if(i == 27) { deck[i] = new Card("KC", 13, false); }
            if(i == 28) { deck[i] = new Card("QC", 12, false); }
            if(i == 29) { deck[i] = new Card("JC", 11, false); }
            if(i>29&&i<39){ deck[i] = new Card((i-28)+"C", j, false); j++;}
            if(i == 39) { deck[i] = new Card("AD", 14, false); j=2;}
            if(i == 40) { deck[i] = new Card("KD", 13, false); }
            if(i == 41) { deck[i] = new Card("QD", 12, false); }
            if(i == 42) { deck[i] = new Card("JD", 11, false); }
            if(i>42&&i<52){ deck[i] = new Card((i-41)+"D", j, false); }    
        }
        return deck;
    }
    public Card[] shuffle(Card[] cartas){
        Card[] deckArray = cartas;
        List<Card> deckList = Arrays.asList(deckArray);
		Collections.shuffle(deckList);
		deckList.toArray(deckArray);
        return deckArray;
    }
}
