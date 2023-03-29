package org.mystatic;

public class TestStatic {
	private static int staticVariable=0;
	
	

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
	}
	
	public static class Inner{
		public static void testingInnerMethod() {
			System.out.println("Printing Inner");
		}
	}
	
	
}
