package org.store;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Door door = new Door();
		
//		door.shopStatus();
//		door.getLock().setLock(false);
//		
		System.out.println(door.getLock().isUnlocked("qwerty"));
		door.getLock().test();
//		
//		if(new Door().isLocked(args[0])) {
//			System.out.println("Shop is Closed, come back later Thanks.");
//		} else {
//			System.out.println("Come on In, We're open");
//		}
	}

}
