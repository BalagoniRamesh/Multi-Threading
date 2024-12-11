package com.rameshsoft.multi_threading;

class MyRunnable implements Runnable {
	public void run() {		
			System.out.println("user defined thread..."+Thread.currentThread().getName());	
	}
}

class Test10 {
	public static void main(String[] args) {
		//1.Taking the separate class to write the logics passing the object.	
		MyRunnable r = new MyRunnable();
		new Thread(r).start();
		new Thread(new MyRunnable()).start();
		
		//2.Instead of taking separate class : anonymous class
		new Thread(new Runnable() {
				public void run() {
					System.out.println("This is anonymous class approach...");
				}
			}).start();
		
		//3.lambda to take create thread 
		new Thread(() -> System.out.println("lamda threads")).start();
	}
}
