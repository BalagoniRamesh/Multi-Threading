//package com.rameshsoft.multi_threading;
//
//class MyThread extends Thread {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Good Morning...." + Thread.currentThread().getName());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
//
//public class Test5 {
//	public static void main(String[] args) throws InterruptedException {
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		MyThread t3 = new MyThread();
//		t1.start();
//		t1.join();
////		t1.join(2000);
////		t1.join(2000,1000);
//		t2.start();
//		t2.join();
//		t3.start();
//
//	}
//}