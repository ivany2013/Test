package com.xl.demo;


public class MyThread extends Thread{


	public MyThread() {
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 1000000; i++) {
				System.out.println(TestMain.bo+""+i);
				if (TestMain.bo){
					Thread.currentThread().interrupt();
					Thread.sleep(100L);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}
