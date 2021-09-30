package per.projects.classestest;
import per.projects.classeslibs.*;

public class Main{
	public static void main(String[] args){
		Item[] items = new Item[4];
		for(int i = 0; i<items.length;i++){
			items[i]=new Item();
			items[i].setName("Item"+i);
			items[i].setPrice(10);
		}
		Ch[] characters = new Ch[10];
		Item[] chItems = {items[1], items[2]};
		for(int i = 0; i<characters.length;i++){
			characters[i]=new Ch();
			characters[i].setName("Character"+i);
			characters[i].setStrength(10);
			characters[i].setIntelligence(10);
			characters[i].setDexterity(10);
			characters[i].setEndurance(10);
			characters[i].setAgility(10);
			characters[i].setItems(chItems);
		}
		for(Ch c : characters){
			System.out.println(c.getAll());
		}
	}
}