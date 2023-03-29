package black.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Data{
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
}

class ComparableObject<T extends Comparable<T>> implements Comparable<T>{
	private T myVariable;

	public ComparableObject(T myVariable) {
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return getMyVariable().compareTo(o);
//		return 0;
	}
	
	
}


class GenericClass<T>{
	private T unknownType;

	public GenericClass(T unknownType) {
		this.unknownType = unknownType;
	}

	public T getUnknownType() {
		return unknownType;
	}

	public void setUnknownType(T unknownType) {
		this.unknownType = unknownType;
	}

	@Override
	public String toString() {
		return "GenericClass [unknownType=" + unknownType + "]";
	}
}


class Dictionary<K,V>{
	private K key;
	private V value;
	public Dictionary(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Dictionary [key=" + key + ", value=" + value + "]";
	}
	
	
	public <E, N> void display(E element, N number) {
		System.out.println("Element: "+element+", Number: "+number);
	}
}

class GenMethod{
	
	public<E> void printList(List<E> list) {
		for(E element: list) {
			System.out.println(element);
		}
	}
	
	public <E> void printArrayDaya(E[] arrayData) {
		for(E element: arrayData) {
			System.out.println(element);
		}
	}
}

class BoundedPair<K,V>{
	private K key;
	private V value;
	public BoundedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "BoundedPair [key=" + key + ", value=" + value + "]";
	}
	
	public <E,N extends Number> void display(E element, N number) {
		System.out.println("Element: "+element+", Number: "+number);
	}
}






public class NewApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data data = new Data("Some String");
		String var1 = (String) data.getObj();
		System.out.println(var1);
		
		
		GenericClass<LinkedList<String>> mylinkedList = new GenericClass<LinkedList<String>>(new LinkedList<String>());
		mylinkedList.getUnknownType().add("Data Var 1");
		mylinkedList.getUnknownType().add("Var 2");
		System.out.println(mylinkedList);
		
		
		List<GenericClass<Object>> elements = new LinkedList<>();
		elements.add(new GenericClass<Object>("Some String 1"));
		elements.add(new GenericClass<Object>("Some String 2"));
		elements.add(new GenericClass<Object>(5.0D));
		elements.add(new GenericClass<Object>(25));
		elements.add(new GenericClass<Object>(44.22f));
		
		System.out.println(elements);
		
		
		Dictionary<Integer, String> newDict = new Dictionary<Integer, String>(1, "Some String");
		
		System.out.println(newDict.getKey());
		newDict.display("Carbon", 6);
		
		
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		
		List<String> listString = new ArrayList<>();
		listString.add("John");
		listString.add("Doe");
		listString.add("Malkovic");
		
		
		GenMethod genmethod = new GenMethod();
		genmethod.printList(listInteger);
		
		genmethod.printList(listString);
		
		
		ComparableObject<Integer> mycomparable = new ComparableObject<Integer>(1);
		System.out.println(mycomparable.compareTo(8));
		
	}

}
