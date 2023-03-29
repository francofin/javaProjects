package black.main;

import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

class DictionaryData<K,V>{
	private K key;
	private V value;
	public DictionaryData(K key, V value) {
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
	
	
}

public class Sets {
	

	public static void main(String[] args) {
		
		Comparator<DictionaryData<Integer, String>> COMPARE_KEY= new Comparator<DictionaryData<Integer,String>>() {

			@Override
			public int compare(DictionaryData<Integer, String> o1, DictionaryData<Integer, String> o2) {
				// TODO Auto-generated method stub
				if(o1.getKey() < o2.getKey()) {
					return -1;
				} else if(o1.getKey() == o2.getKey()) {
					return 0;
				} else {
					return 1;
				}
				
			}
			
			
		};
		// TODO Auto-generated method stub
		Set<String> mySet = new HashSet<String>();
		mySet.add("Frank");
		mySet.add("Jason");
		mySet.add("Michael");
		mySet.add("Jason");
		mySet.add("Mike");
		mySet.add("Allen");
		mySet.add("Durant");
		
		for(String name: mySet) {
			System.out.println(name);
		}
		
		
		Set<DictionaryData<Integer, String>> myDict = new LinkedHashSet<DictionaryData<Integer, String>>();
		myDict.add(new DictionaryData<Integer, String>(1,"Michael"));
		myDict.add(new DictionaryData<Integer, String>(5,"John"));
		myDict.add(new DictionaryData<Integer, String>(15,"Malkovic"));
		
		Set<DictionaryData<Integer, String>> treeSet = new TreeSet<DictionaryData<Integer, String>>(COMPARE_KEY);
		treeSet.add(new DictionaryData<Integer, String>(1,"Michael"));
		treeSet.add(new DictionaryData<Integer, String>(5,"John"));
		treeSet.add(new DictionaryData<Integer, String>(15,"Malkovic"));
		
		for(DictionaryData<Integer, String> set: treeSet) {
			System.out.println(set);
		}
		
		Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		for(Integer item: queue) {
			System.out.println(item);
		}
		
		Queue<Integer> arrayQueue = new ArrayBlockingQueue<Integer>(6);
		arrayQueue.add(1);
		arrayQueue.add(2);
		arrayQueue.offer(5);
		arrayQueue.add(3);
		arrayQueue.add(4);
		
		System.out.println(arrayQueue.offer(5));
		System.out.println("removed"+arrayQueue.poll());
		
		for(Integer item: arrayQueue) {
			System.out.println(item);
		}
		
		Deque<Integer> arrayDequeue = new LinkedBlockingDeque<Integer>();
		arrayDequeue.add(1);
		arrayDequeue.add(2);
		arrayDequeue.offer(5);
		arrayDequeue.add(3);
		arrayDequeue.add(4);
		
		System.out.println(arrayDequeue.offer(5));
		System.out.println("removed"+arrayDequeue.poll());
		
		for(Integer item: arrayDequeue) {
			System.out.println(item);
		}
		
	}

}
