//package com.rameshsoft.multi_threading;
//
//class MyThread extends Thread {
//	int n;
//
//	public MyThread(int n) {
//		this.n = n;
//	}
//
//	@Override
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(n + "*" + i + "=" + (n * i));
//			try {				
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//public class Test8 {
//	public static void main(String[] args) throws InterruptedException{
//		MyThread t1 = new MyThread(4);
//		t1.start();
//		t1.join();
//		MyThread t2 = new MyThread(7);
//		t2.start();
//		t2.join();
//	}
//
//}
