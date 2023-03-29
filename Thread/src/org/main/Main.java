package org.main;

import java.util.Random;

class MyCounter2 implements Runnable{
	private int threadNo;

	public MyCounter2(int threadNo) {
		this.threadNo = threadNo;
	}

	public int getThreadNo() {
		return threadNo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Random randomGen = new Random();
		for(int i=0; i<=9; i++) {
			try {
				Thread.sleep(randomGen.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The Thread is now on thread: "+i+" Thread no from init is "+threadNo);
		}
	}
	
}

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

	@Override
	public String toString() {
		return "MyCounter [threadNo=" + threadNo + "]";
	}

	public int getThreadNo() {
		return threadNo;
	}
	
	
	@Override
	public void run() {
		countThread();
	}

	public void countThread() {
		for(int i=1;  i<10; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The Thread is now on thread: "+i+" Thread no from init is "+threadNo);
		}
	}
	
}

public class Main {
	
	public static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyCounter obj1 = new MyCounter(1);
		MyCounter obj2 = new MyCounter(2);
		
//		MyCounter2 obj3 = new MyCounter2(3);
		
		
//		Using the Runnable Interface
		Thread thread1 = new Thread(new MyCounter2(3));
		Thread thread2 = new Thread(new MyCounter2(4));
		
		long startTime = System.currentTimeMillis();
		thread1.start();
		System.out.println("-------------------------------------------");
		thread2 .start();
		long endTime = System.currentTimeMillis();
//		System.out.println("Process took "+(endTime-startTime)+" Seconds");
		
		
		Thread anonymousThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0; i<=10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Anonymous Thread Running: "+i);
				}
				
			}
		});
		
		Thread anonymousThread2 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i =0; i<=10; i++) {
							
							Main.counter++;
						}
						
					}
				});
		
		Thread anonymousThread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0; i<=10; i++) {
					
					Main.counter++;
				}
				
			}
		});
		
		anonymousThread2.start();
		anonymousThread3.start();
		Thread.sleep(2000);
		System.out.println(Main.counter);

	}

}
