package org.black;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.exceptions.UserDefinedException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main runner = new Main();
		runner.case1(10,0);
		case2(10,8);
		
		int x, y = 10;
		x=20;
		System.out.println(x+" "+y);
		
		try {
			someMethod();
		} catch(FileNotFoundException e) {
			System.out.println("Catch block one runs "+ e);
		} catch (UserDefinedException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Second catch block runs (Exception) "+e);
		} 
		
	}
	
	
	public void case1(int x, int y) {
		if(y!=0) {
			System.out.println("X divided by Y is: "+ x/y);	
		} else {
			System.out.println("Can't divide by 0");
		}
		
	}
	
	public static void case2(double x, double y) {
		try {
			System.out.println("X divided by Y is: "+ x/y);	
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {
			System.out.println("Done");
		}
	}
	
	
	public static void someMethod() throws Exception, FileNotFoundException {
		int x;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter Option");
		x = scan2.nextInt();
		scan2.close();
		
		
		switch(x) {
		case 1:
			throw new FileNotFoundException();
		case 2:
			throw new Exception();
		default:
			throw new UserDefinedException();
		
		}
	}

}
