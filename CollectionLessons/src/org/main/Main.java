package org.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"John", "Doe", "Michael", "Scott"};
		
		for(String name: names) {
			System.out.println(name);
		}
		allNames(names);
		for(String name: names) {
			System.out.println(name);
		}
		
	
		
		int[] accum;
		accum = new int[20];
		for(int i=0; i<10;i++) {
			accum[i] = i;
		}
		for(int i: accum) {
			System.out.println(i);
		}

	}
		public static void allNames(String[] allNames) {
			String[] names = allNames.clone();
			for(String name: names) {
				System.out.println(name);
			}
			names[1] = "McLowry";
			
			for(String name: names) {
				System.out.println(name);
			}
		}
}
