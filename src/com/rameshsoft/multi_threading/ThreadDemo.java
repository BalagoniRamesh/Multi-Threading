//package com.rameshsoft.multi_threading;
//
//class MyThread extends Thread {
//	public void run() {
//		System.out.println("user thread: " + Thread.currentThread().getName());
//		for (int i = 0; i < 10; i++) {
//			System.out.println("user defined thread....");
//
//		}
//	}
//}
//
//class ThreadDemo {
//
//	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		t.start();
//
//		System.out.println("main thread: " + Thread.currentThread().getName());
//		for (int i = 0; i < 10; i++) {
//			System.out.println("main thread....");
//
//		}
//
//	}
//
//}
 

//package com.rameshsoft.multi_threading;
//
//class MyThread extends Thread {
//	public void run() {
//		System.out.println("user thread: " + Thread.currentThread().getName());
//		for (int i = 0; i < 10; i++) {
//			System.out.println("user defined thread....");
//		}
//	}
//}
//
//class AnotherThread extends Thread {
//	public void run() {
//		System.out.println("another thread: " + Thread.currentThread().getName());
//		for (int i = 0; i < 10; i++) {
//			System.out.println("another defined thread....");
//		}
//	}
//}
//
//class ThreadDemo {
//	public static void main(String[] args) { MyThread t1 = new
//  MyThread(); // First thread AnotherThread t2 = new AnotherThread(); // Second
//  thread
//  
//  t1.start(); // Start the first thread t2.start(); // Start the second thread
//  
//  System.out.println("main thread: " + Thread.currentThread().getName()); for
//  (int i = 0; i < 10; i++) { System.out.println("main thread...."); } }
//}
