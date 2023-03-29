package org.main;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class SomeThread extends Thread{
	private CountDownLatch latch;

	public SomeThread(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread running is "+Thread.currentThread().getName());
		System.out.println("Thread running is Done ......."+Thread.currentThread().getName());
		latch.countDown();
	}
	
	
	
	
}
public class App2Join {
	public int counter =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App2Join app = new App2Join();
		
		CountDownLatch latch  = new CountDownLatch(4);
		SomeThread stOne = new SomeThread(latch);
		SomeThread stTwo = new SomeThread(latch);
		SomeThread stThree = new SomeThread(latch);
		SomeThread stFour = new SomeThread(latch);
		
		stOne.start();
		stTwo.start();
		stThree.start();
		stFour.start();
		
		try {
			latch.await();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ExecutorService execService = Executors.newFixedThreadPool(3);
		
		Thread threadOne = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i =0; i< 1000; i++) {
					app.counter++;
				}
			}
		});
		
		
		
		
		Thread threadTwo = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					threadOne.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				for (int i =0; i< 1000; i++) {
					app.counter++;
				}
			}
		});
		
		execService.execute(threadOne);
		execService.execute(threadTwo);
		
		
		execService.shutdown();
		System.out.println(app.counter);
		
//		threadOne.start();
//		threadTwo.start();
		
//		try {
//			threadTwo.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		
//		
////		try {
////			Thread.sleep(2000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		System.out.println(app.counter);
	}	

}
