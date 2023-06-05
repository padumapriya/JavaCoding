package com.javafundamental;
import java.util.Scanner;
public class GreetUser {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); //creating a scanner object for getting input from user
		System.out.println("Please enter the user name");
		String userName = read.next();
		System.out.println("Hello " + userName+ "!!");
		read.close();
	}

}
