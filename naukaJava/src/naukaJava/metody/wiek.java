package naukaJava.metody;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class wiek {

	public int myAge(int rokUrodzenia) {
		int result = Year.now().getValue() - rokUrodzenia;
		return result;
	}
	
	String myName(String name){
		  return name;
		}
	
	void operacje(int a, int b) {
			  System.out.print(a+b);
			  System.out.print(" ");
			  System.out.print(a-b);
			  System.out.print(" ");
			  System.out.print(a*b);
	}

	public static void main(String[] args) {

	wiek w = new wiek();

	w.operacje(3, 3);
	}

}
