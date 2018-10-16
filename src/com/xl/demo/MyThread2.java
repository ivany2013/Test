package com.xl.demo;


public class MyThread2 extends Thread{

	@Override
	public void run() {
		try {
			SyncTest.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}
