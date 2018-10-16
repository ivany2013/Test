package com.xl.demo;

public class SyncTest {
	
	public static synchronized void test(){
		long start = System.currentTimeMillis();
		System.out.println("lock:" + start);
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			long end = System.currentTimeMillis();
			System.out.println("unlock:" + end + " , use time :" + (end - start));
		}
	}
}
