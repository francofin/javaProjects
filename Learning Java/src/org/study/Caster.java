package org.study;

public class Caster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short y = 10;
		int x = 50;
		short z = (short) x;
		System.out.println(z);

		boolean myBool;

		myBool = (5 > 6) ? true : false;
		System.out.println(myBool);
		
		String mySwitch = "tom";
		
		
		switch(mySwitch) {
		case "true":
			System.out.println("Data is True");
			break;
		case "false":
			System.out.println("Data is Bad");
			break;
		default:
			System.out.println("Improper input detected");
			break;
		}
		
		for (int i =1; i < 5; i++) {
			System.out.println(i+": Number "+ i);
		}
		
		int a = 0;
		
		for (; a < 5; a++) {
			System.out.println(a+": Number A "+ a);
		}
		
//		int j =0;
//		
//		while (j < 10) {
//			System.out.println(j+": J is "+j);
//			j++;
//		}
		
//		int e = 10;
//		do {
//			if(e == 0) {
//				System.out.println("Blastoff");
//			} else {
//				System.out.println(e+": T minus "+e);
//			}
//			
//			e--;
//		}while(e>=0);
		
//		for (int i=1, j=1; i< 10 && j<10; i++, j++) {
//			System.out.println("I is "+i+" and J is "+j);
//		}
		
		int i=1, j=1;
		
		while (i<10 || j < 10) {
			i++;
			j++;
			System.out.println("I is "+i+" and J is "+j);
		}

	}

}
