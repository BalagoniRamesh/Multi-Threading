//package com.rameshsoft.multi_threading;
//
//class MyThread extends Thread {
//	@Override
//	public void run() {
//		add(10, 20);
//		mul(5, 9);
//	}
//
//	private void add(int num1, int num2) {
//		System.out.println("Addition...:"+(num1 + num2));
//	}
//
//	private void mul(int num1, int num2) {
//		System.out.println("Multiplication....:"+num1 * num2);
//	}
//}
//
//public class Test4 {
//	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		t.start();
//	}
//}