//package com.rameshsoft.multi_threading;
//
//class MyThread extends Thread {
//	@Override
//	public void run() {
//		System.out.println("Thread name..." + Thread.currentThread().getName());
//		System.out.println("Thread name..." + Thread.currentThread().getPriority());
//	}
//}
//
//public class Test11 {
//	public static void main(String[] args) {
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		t1.setPriority(10); // t1.setPriority(Thread.MAX_PRIORITY)
//		t2.setPriority(1); // t1.setPriority(Thread.MIN_PRIORITY)
//
//		t1.start(); 
//		t2.start();
//	}
//}
