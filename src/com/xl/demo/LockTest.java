package com.xl.demo;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	public static ReentrantLock lock = new ReentrantLock();
	public static Integer j = 0;
	
	public static void test(){
		lock.lock();
		long start = System.currentTimeMillis();
		System.out.println("lock:" + start);
		try {
			for (int i = 0; i < 1000; i++) {
				j++;
			}
			System.out.println("count : " + j);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			long end = System.currentTimeMillis();
			lock.unlock();
			System.out.println("unlock:" + end + " , use time :" + (end - start));
		}
	}
	
}
