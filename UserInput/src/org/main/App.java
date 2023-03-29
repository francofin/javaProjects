package org.main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Whats Your Name?");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		System.out.println("Hi "+name+", have a nice day");

		System.out.println("Whats Your age?");
		Scanner scan2 = new Scanner(System.in);
		int age = scan2.nextInt();
		scan2.close();
		scan.close();
		System.out.println("You are "+age+", years old, confirm?");
	}

}
