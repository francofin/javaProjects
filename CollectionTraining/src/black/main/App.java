package black.main;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names>{
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		// TODO Auto-generated method stub
		
		if(name.length() == obj.name.length()) {
			return 0;
		} else if(name.length() < obj.name.length()){
			return -1;
		} else {
			return 1;
		}
		
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Names [name=" + name + "]";
	}
	
	
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a";
		String b = "b";
		a.compareTo(b);
		
		List<Names> names = new LinkedList<>();
		names.add(new Names("Frank"));
		names.add(new Names("Michael"));
		names.add(new Names("John"));
	
		printList(names);
	}
	
	
	static void printList(List<Names> myList) {
		ListIterator<Names> iterator = myList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
