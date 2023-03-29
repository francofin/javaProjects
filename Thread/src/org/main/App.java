package org.main;

public class App {
	private Object lock="lock";
	public static int balance=0;
	public void withdraw(int amount) {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		System.out.println("Checking balance "+balance);
		synchronized (this){
			if (balance <=0 || amount > balance){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
//					System.out.println("Thread Interrupted");
					balance = balance - amount;
					System.out.println("Withdrawal successful, new balance "+ balance);
				}
			}
			
			
		}
		
	}
	
	
	public void deposit(int amount) {
		System.out.println("Current Balance is "+balance);
		System.out.println("Deposit of "+amount+" accepted");
//		balance = balance+amount;
		synchronized (this) {
			balance = balance+amount;
			if(balance == amount) {
				System.out.println("Account balance is now "+balance);
//				notify();
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App app = new App();
		Thread threadOne = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				app.withdraw(1000);
			}
		});
		threadOne.setName("Thread-1");
		threadOne.start();
		
		
		Thread threadTwo = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deposit(2000);
				if(balance > 0) {
					threadOne.interrupt();
					
				}
			}
		});
		threadTwo.setName("Thread-2");
		threadTwo.start();
		
		
		

	}

}
