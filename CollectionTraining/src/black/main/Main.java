package black.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

	static ArrayList<String> myStringList = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myIntegerArray = new ArrayList<>();
		
		
		for(int i =0; i<=10; i++) {
			myIntegerArray.add(i);
		}
		
		System.out.println(myIntegerArray);
		
		Stack<Integer> nemo = new Stack<>();
		nemo.push(0);
		nemo.push(1);
		nemo.push(2);
		
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("brazil");
		countries.add("Morroco");
		countries.add("Trinidad");
		countries.add("USA");
		
		
		// TODO Auto-generated method stub
		myStringList.add("John");
		myStringList.add("Markovic");
		System.out.println(myStringList.get(0));
		System.out.println(myStringList);
		
		modifyName(0, "Michael");
		System.out.println(myStringList);
		
		System.out.println(myStringList.indexOf("Michael"));
	}
	
	static void modifyName(int position, String newName) {
		myStringList.set(position, newName);
	}

}
