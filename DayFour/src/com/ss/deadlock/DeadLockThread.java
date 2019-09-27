package com.ss.deadlock;

public class DeadLockThread {

	
	
	public static Object obj = new Object();
	public static Object jbo = new Object();
	
	
	private static class thread1 extends Thread{
		public void run() {
			synchronized(obj) {
				System.out.println("Holding 1");
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Waiting for 2");
				
				synchronized(jbo) {
					System.out.println("Holding 1 & 2");
				}
			}
		}
	}
	
	
	private static class thread2 extends Thread{
		public void run() {
			synchronized(jbo) {
				System.out.println("Holding 2");
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Waiting for 1");
				
				synchronized(obj) {
					System.out.println("Holding 1 & 2");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		
		t1.start();
		t2.start();
		

	}

}
