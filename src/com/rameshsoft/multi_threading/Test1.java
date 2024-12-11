//package com.rameshsoft.multi_threading;
//
//class MyThread extends Thread{
//	@Override
//	public void run() {
//		for(int i =0; i<10; i++)
//		{			
//			try {
//				Thread.sleep(1000);
//				System.out.println("user defined thread");
//			} catch(InterruptedException e) {
//				e.printStackTrace();				
//			}			
//		}
//	}
//}
//public class Test1 {
//	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		t.start();
//		t.interrupt();
//	}
//
//}
