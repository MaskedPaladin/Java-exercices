package per.projects.maintest;
import java.io.File;
import java.io.PrintWriter;

public class Writey{
	public static void main(String[] args){
		try{
			File file = new File(args[0]);
			PrintWriter printInput = new PrintWriter(file);
			char character = 'a';
			for(int i = 0; i<26; i++){
				printInput.print(character);
				character++;
			}
			printInput.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}