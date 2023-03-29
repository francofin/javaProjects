package org.store;

abstract class Lock{
	public abstract boolean isUnlocked(String keyCode);
	
	public void test() {
		System.out.println("Testing Lock");
	}
	
}

public class Door {
	
	Lock lock = new Lock() {
		
		@Override
		public boolean isUnlocked(String keyCode) {
			// TODO Auto-generated method stub
			if(keyCode.equals("qwerty")) {
				return true;
			} else {
				return false;
			}
			
		}
	};
	
//	private Lock lock;
//	
//	public Door() {
//		lock = new Lock(true);
//	}
//	
//	
//	public void shopStatus() {
//		if(lock.isLock()) {
//			System.out.println("Store Closed, come back later.");
//		} else {
//			System.out.println("We are open, come on in.");
//		}
//	}
//	
//
//	public boolean isLocked(String key) {
//		
//		class Lock{
//			public boolean isLocked(String key) {
//				if(key.equals("qwerty")) {
//					return false;
//				} else {
//					return true;
//				}
//			}
//		}
//		
//		return new Lock().isLocked(key);
//		
//	}
	

	public Lock getLock() {
		return lock;
	}

//
//	public class Lock{
//		private boolean lock;
//
//		public Lock(boolean lock) {
//			super();
//			this.lock = lock;
//		}
//
//		public boolean isLock() {
//			return lock;
//		}
//
//		public void setLock(boolean lock) {
//			this.lock = lock;
//		}
//		
//		
//	}
}
