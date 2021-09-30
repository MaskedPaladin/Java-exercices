package per.projects.classeslibs;
import per.projects.classeslibs.*;

public class Item{
	private String name;
	private int price;
	public Item(String name, int price){
		this.name = name;
		this.price = price;
	}
	public Item(){}
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
	public String getAll(){
		return "Name: "+this.getName()+" | Price: "+this.getPrice()+" ";
	}
}