package com.xl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Array;
import java.util.*;


public class TestMain {
	public static volatile Boolean  bo = false;
	public static void main(String[] args) {

		Thread t = new MyThread();
		t.start();
		try {
			Thread.sleep(100L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
		bo = true;


		/*List list1 = new LinkedList();
		List list2 = new ArrayList();


		int i = 1;
		int j = 2;
		Integer[] a = new Integer[5];
		a[0] = 7;
		SyncTest sy = new SyncTest();

		Test t = new Test();*/
	}

//	default String test(){
//		System.out.println("123");
//		return "123";
//	};
//
//	String test1();
}
