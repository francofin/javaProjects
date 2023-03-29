package org.main;

import org.mystatic.TestStatic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(TestStatic.getStaticVariable());
		
		TestStatic.setStaticVariable(1);
		System.out.println(TestStatic.getStaticVariable());
		
	
		
		System.out.println(TestStatic.getStaticVariable());
		
		TestStatic.setStaticVariable(24);
		System.out.println(TestStatic.getStaticVariable());
		
		TestStatic.Inner.testingInnerMethod();
		
		
	}
	

}
