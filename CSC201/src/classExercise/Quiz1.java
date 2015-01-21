package classExercise;

import java.util.Scanner;

public class Quiz1 {
	
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username");
		String accountname = keyboard.next();
		System.out.println("Enter password");
		String password = keyboard.next();
		System.out.println("Hello, " + 
		accountname + ". Your Password is " 
				+ password + ".");
		
	}
}

