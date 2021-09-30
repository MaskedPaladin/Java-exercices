package per.projects.maintest;
import java.io.File;
import java.util.*;

public class Main{
	/**
  * Recursive function that prints absolute path of all
  *	documents which contains pattern given by parameter
  * 
  * 
  *	@author Carlos Jiménez
  * @version 1.0
  * @param debug Printar los errores.
  * @return Void
  * @throws NullPointerException En caso de no haber archivo o directorio que leer.
  * @throws ArrayIndexOutOfBoundsException En caso de no haber especificado ningun parametro.
  */
	public static void ls(File path){
			File[] fileList = path.listFiles();
			for(File f : fileList){
				System.out.println(f.getAbsolutePath());
				if (f.isDirectory()){
					ls(f);
				}
			}
		}
	public static void main(String[] args){
		ls(new File("C:/"));
	}
}