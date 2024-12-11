//package com.rameshsoft.multi_threading;
//
//class MyThread extends Thread {
//	@Override
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("Deamon Thread");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//public class Test9 {
//	public static void main(String[] args) throws InterruptedException {
//		MyThread t = new MyThread();
//		System.out.println(t.isDaemon());
//		t.setDaemon(true);
//		System.out.println(t.isDaemon());
//		t.start();
//
//		for (int i = 0; i < 2; i++) {
//			System.out.println("Main Thread");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
