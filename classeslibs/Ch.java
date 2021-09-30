package per.projects.classeslibs;
import per.projects.classeslibs.*;

public class Ch{
	private String name;
	private int life, mana, strength, stamina, intelligence, dexterity, endurance, agility;
	private Item[] items = new Item[10];
	public Ch(String name, Item[] items, int strength, int intelligence, int dexterity, int endurance, int agility){
		this.name = name;
		this.items = items;
		this.life = strength+endurance;
		this.mana = intelligence;
		this.strength = strength;
		this.stamina = strength*endurance;
		this.intelligence = intelligence;
		this.dexterity = dexterity;
		this.endurance = endurance;
		this.agility = agility;
	}
	public Ch(){}
	public void setName(String name){
		this.name = name;
	}
	public void setStrength(int strength){
		this.strength = strength;
	}
	public void setIntelligence(int intelligence){
		this.intelligence = intelligence;
	}
	public void setDexterity(int dexterity){
		this.dexterity = dexterity;
	}
	public void setEndurance(int endurance){
		this.endurance = endurance;
	}
	public void setAgility(int agility){
		this.agility = agility;
	}
	public void setItems(Item[] items){
		this.items = items;
	}
	public String getName(){
		return this.name;
	}
	public int getLife(){
		return this.life;
	}
	public int getMana(){
		return this.mana;
	}
	public int getStrength(){
		return this.strength;
	}
	public int getStamina(){
		return this.stamina;
	}
	public int getIntelligence(){
		return this.intelligence;
	}
	public int getDexterty(){
		return this.dexterity;
	}
	public int getEndurance(){
		return this.endurance;
	}
	public int getAgility(){
		return this.agility;
	}
	public Item[] getItems(){
		return this.items;
	}
	public String getAll(){
		String items = "";
		for(Item i: this.items){
			items=items+i.getAll();
		}
		return "Name: "+this.getName()+" | Strength: "+this.getStrength()+" | Intelligence: "+this.getIntelligence()+" | Dexterity: "+this.getDexterty()+" | Endurance: "+this.getEndurance()+" | Agility: "+this.getAgility()+" | Items: "+items;
	}
}
