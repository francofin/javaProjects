package org.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;

interface Lambda{
	public void demo();
}


class Data{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
	
}
public class Main {
	private static String unlockCode = "AXKSMKSNNDUW9228292___W@_@#(@IU)@J)NWUNA h sah sahbndniunxunm mkxmiowmoixmin le@udb!(eh)d)sskaksi@_!i!)wi@)@+w@sl{@smodj";
	private static long releaseAmount = 1000000;
	
	public void unlockSoftware(String unlockKey) {
		synchronized (this) {
			if (unlockKey.equals(unlockCode))
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public void payForRelease(boolean switcherRoooo) {
		long payment = 0;
		long breaker = 1000;
		if (payment == 0) {
			System.out.println("Please Enter the payment amount of $1,000,000.00. Ensure the numbers are not comma separated. Mis payments will not be subject for full unlock code relsease."
					+ "Any partial amounts will not count towards total payment and if a partial is supplied in the amount field, it will be free money as the 1,000,000 purchase price will still be due."
					+ "Please do not contact authorities for your entire system will be wiped, your data distributed and your secrets shared. We thank you for your cooperation. --blackKombo");
			Scanner scanAnswer = new Scanner(System.in);
			long answer = scanAnswer.nextLong();
			if (answer == releaseAmount) {
				switcherRoooo = !switcherRoooo;
				notify();
			} else {
				while(switcherRoooo) {
					System.out.println("You Have Been Hacked, You Have Been Hacked, You Have Been Hacked, You Have Been Hacked,"
							+ "You Have Been Hacked, You Have Been Hacked, You Have Been Hacked, You Have Been Hacked.........");
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lambda lambdaOne = () -> System.out.println("Statement from true lambda");
		lambdaOne.demo();
		
		Lambda lambdaThree = () -> {
			System.out.println("Statement from Lambda three mutli statement");
			System.out.println("Printing more stuff");
		};
		
		lambdaThree.demo();
	
		Lambda lambdaTwo  = new Lambda() {
			
			@Override
			public void demo() {
				// TODO Auto-generated method stub
				System.out.println("Statement from lambda interface");
				
			}
		};
		
		lambdaTwo.demo();
		
		Thread threadOne = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		Thread threadTwo = new Thread(() -> {
			System.out.println("In Thread two being executed");
			boolean switchBool = true;
			while(switchBool) {
				
				}
			});
		threadTwo.start();
		
		
		List<Data> myData = new ArrayList<Data>();
		myData.add(new Data("John"));
		myData.add(new Data("Michael"));
		myData.add(new Data("Junior"));
		myData.add(new Data("Sam"));
		myData.add(new Data("Mikael"));
		myData.add(new Data("Robonovic"));
		
		Collections.sort(myData, new Comparator<Data>() {

			@Override
			public int compare(Data o1, Data o2) {
				// TODO Auto-generated method stub
				
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		Collections.sort(myData, (Data obj1, Data obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		});
		
		
//		for(Data name: myData) {
//			System.out.println(name.getName());
//		}
//		
		
		myData.forEach(i -> {
			System.out.println(i.getName());
		});
		
		IntPredicate lessthan5 = i -> i<5;
		
		System.out.println("With Lambda i is "+lessthan5.test(2));
		
		
		IntPredicate lessThan10 = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				// TODO Auto-generated method stub
				if (value < 10) {
					return true;
				} else {
					return false;
				}
				
			}
		};
		
		System.out.println(lessThan10.test(2));

	}
	
	
	public boolean compareAnswer(int x) {
		if(x==(1+1)) {
			notify();
		}
	}

}
