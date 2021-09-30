package per.projects.maintest;
import java.lang.Math;
import java.io.*;
public class Mathexample{
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		System.out.println(Math.pow(a, b));
	}
}