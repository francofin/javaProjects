package black.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Random;

class Code  implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(lectureNo, sectionNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo().concat(o.getLectureNo());
		return code1.compareTo(code2);
	}
	
	
}

public class MyMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer, String> student = new HashMap<>();
		student.put(1, "Mike");
		student.put(2, "Sam");
		student.put(3, "Bob");
		
		
//		for(Map.Entry<Integer, String> person: student.entrySet()) {
//			System.out.println(person);
//		}
		
		for (Integer el: student.keySet()) {
			System.out.println("Element: "+el+" Value: "+student.get(el));
		}
		
		Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();
		
		while(entry.hasNext()) {
			System.out.println(entry.next());
		}
		
		Map<Code, String> lectures = new TreeMap<Code, String>();
		lectures.put(new Code("S01", "L01"), "Generics");
		lectures.put(new Code("S01", "L05"), "Collections");
		lectures.put(new Code("S01", "L01"), "Maps");
		lectures.put(new Code("S01", "L02"), "Arrays");
		lectures.put(new Code("S01", "L01"), "LinkedLists");
		lectures.put(new Code("S02", "L01"), "JSP");
	
		
//		for (Map.Entry<Code, String> el: lectures.entrySet()) {
//			System.out.println("Element: "+el.getValue()+" Value: "+el.getKey());
//		}
		
		Code code1 = new Code("S01", "L01");
		Code code2 = new Code("S01", "L01");
		System.out.println(code1.hashCode()+" "+code2.hashCode());
		
		System.out.println(code1.equals(code2));
		
		Queue<Integer> queue= new ArrayBlockingQueue<Integer>(7);
		
		queue.add(2);
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(1);
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(queue);
		Collections.sort(list);
		
		for(Integer el: list) {
			System.out.println(el);
		}
		
		
		System.out.println(Collections.binarySearch(list, 5));
		
		
//		String name1 = "MyName";
//		String name2 = "MyName";
//		
//		System.out.println(name1 == name2);
	}

}
