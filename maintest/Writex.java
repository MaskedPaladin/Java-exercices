package per.projects.maintest;
import java.io.File;
import java.io.PrintWriter;

public class Writex{
	public static void main(String[] args){
		try{
			File file = new File(args[0]);
			PrintWriter printInput = new PrintWriter(file);
			printInput.print("1200 ");
			printInput.print("1400 ");
			printInput.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}