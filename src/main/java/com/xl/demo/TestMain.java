package com.xl.demo;

import org.apache.thrift.TException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Array;
import java.util.*;


public class TestMain {

	public static volatile Boolean  bo = false;
	public static void main(String[] args) {
//        Test test = new Test("face-capture-ytlf");
		TestStatic test2 = new TestStatic("face-lib-escape");//face-lib-permanent face-lib-escape
//		try {
//			CaptureConsumer test = new CaptureConsumer("face-alert");//face-alert
//		} catch (TException e) {
//			e.printStackTrace();
//		}
//		String addr = "广东省深圳市南山区西乡某镇某村某街道";
//		String addr = "漳州市芗城区上井56号某某小区1-301";
//		String[] strings = new String[]{"乡","镇", "路", "村", "街", "道"};
//		String[] stringNum = new String[]{"1","2", "3", "4", "5", "6","7","8","9","0"};
//		List<String> stringList = Arrays.asList(strings);
//		List<String> numList = Arrays.asList(stringNum);
//		List<Integer> intList = new ArrayList<>();
//		List<Integer> numIntList = new ArrayList<>();
//		for (String str : stringList) {
//			int i = addr.indexOf(str);
//			if (i != -1){
//				intList.add(i);
//			}
//		}
//		for (String str : numList) {
//			int i = addr.indexOf(str);
//			if (i != -1){
//				numIntList.add(i);
//			}
//		}
//		Collections.sort(intList);
//		Collections.sort(numIntList);
//		if (intList.size() != 0 && numIntList.size() != 0){
//			if(intList.get(0) < numIntList.get(0)){
//				addr = addr.substring(0, intList.get(0)+1);
//			}else{
//				addr = addr.substring(0, numIntList.get(0));
//			}
//		}else if (intList.size() == 0 && numIntList.size() != 0){
//			addr = addr.substring(0, numIntList.get(0));
//		}else if(intList.size() != 0 && numIntList.size() == 0){
//			addr = addr.substring(0, intList.get(0)+1);
//		}
//		addr = addr + "XXXXXX";
//		System.out.println(addr);
//		for (int i = 0; i < 101; i++) {
//			BigDecimal bigDecimal = new BigDecimal(i).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP);
//			System.out.println(
//					"INSERT INTO intellif_base.t_rule_info (rule_description,rule_name,thresholds,types) VALUES (\""+i+"\",\""+i+"\",\""+bigDecimal.floatValue()+","+bigDecimal.add(new BigDecimal(0.01)).setScale(2, RoundingMode.HALF_UP).floatValue()+","+bigDecimal.add(new BigDecimal(0.02)).setScale(2, RoundingMode.HALF_UP).floatValue()+"\",\"0,1,2\");"
//
//			);
//		}
	}
}
