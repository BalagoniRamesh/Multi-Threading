//package com.rameshsoft.multi_threading;
//
//class MyThread1 extends Thread {
//	public void run() {
//		for (int i = 0; i < 2; i++) {
//			System.out.println("Good Morning...." + Thread.currentThread().getName());
//		}
//	}
//}
//
//class MyThread2 extends Thread {
//	public void run() {
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Good Evening...." + Thread.currentThread().getName());
//		}
//	}
//}
//
//class MyThread3 extends Thread {
//	public void run() {
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Good Night...." + Thread.currentThread().getName());
//		}
//	}
//}
//
//public class Test6 {
//	public static void main(String[] args) throws InterruptedException{
//		MyThread1 t1 = new MyThread1();
//		MyThread2 t2 = new MyThread2();
//		MyThread3 t3 = new MyThread3();		
//		t1.setName("Ramesh");
//		t2.setName("Niranjan");
//		t3.setName("Rani");
//		t1.start();
//		t1.join();
//		t2.start();
//		t1.join();
//		t3.start();
//	}
//}