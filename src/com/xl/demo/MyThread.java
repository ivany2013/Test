package com.xl.demo;


public class MyThread extends Thread{

	@Override
	public void run() {
		try {
			LockTest.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}
