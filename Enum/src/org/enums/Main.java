package org.enums;

import java.util.Scanner;

public class Main {
	
//	public static final int COREJAVA = 1;
//	public static final int COLLECTIONS =2;
//	public static final int GENERICS = 3;
//	public static final int JSPANDSERVLETS = 4;
//	public static final int MULTITHREADING = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Learning learn = Learning.COLLECTIONS;
		System.out.println("Enter Option");
		Scanner scan = new Scanner(System.in);
//		learn = scan.nextInt();
		
		
		switch(learn) {
		case COLLECTIONS:
			System.out.println("Step 2 ; Learning Collections");
			break;
		case COREJAVA:
			System.out.println("Step 1: Learning Core Java");
			break;
		case GENERICS:
			System.out.println("Step 3: Learning Generics");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 4: Learning Servlets");
			break;
		case MULTITHREADING:
			System.out.println("Step 5: Learning Multithreading");
			break;
		default:
			break;
		}
		
		
		String x = "steady";
		String y = "Easy";
		String z = x+y;
		
		System.out.println(z);
		
		if(z.equals("steadyEasy")) {
			z = z.replace("steady", "crazy");
			System.out.println(z);
			System.out.println("Text is correct");
		} else {
			System.out.println("Text is incorrect");
		}
		
//		int learning = COREJAVA;
//		switch(learning) {
//		case COLLECTIONS:
//			System.out.println("Step 2 ; Learning Collections");
//			break;
//		case COREJAVA:
//			System.out.println("Step 1: Learning Core Java");
//			break;
//		case GENERICS:
//			System.out.println("Step 3: LEarning Generics");
//			break;
//		default:
//			break;
//		}

	}

}
