package cis232.examples;

import java.util.Scanner;

public class SplitExample {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter emails separated by a ;");
		
		String emailsInput = keyboard.nextLine();
		
		String[] tokens = emailsInput.split(";");
		System.out.printf("There are %d emails%n", tokens.length);
		
		for(String email : tokens){
			System.out.println(email);
			String[] emailParts = email.split("[@.]");
			System.out.printf("There are %d email parts%n", emailParts.length);
			for(String emailPart : emailParts){
				System.out.println(emailPart);
			}
		}
	}
	
}
