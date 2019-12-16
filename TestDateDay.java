package com.BridgeLabz.test;

import java.util.HashMap;
import java.util.Map;

import com.BridgeLabz.AlgorithmBased.Util;

public class TestDateDay {

	public static void main(String[] args) {
		//System.out.println("Enter the day");
		int d=Integer.parseInt(args[0]);
		
		//System.out.println("Enter the month");
		int m=Integer.parseInt(args[1]);
		
		//System.out.println("Enter the year");
		int y=Integer.parseInt(args[2]);
		
		int dof=Util.dayOfWeek(d, m, y);
		System.out.println(dof);
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(0,"Sunday");
		m1.put(1,"Monday");
		m1.put(2, "Tuesday");
		m1.put(3, "Wednesday");
		m1.put(4, "Thursday");
		m1.put(5, "Friday");
		m1.put(6, "Saturday");
		System.out.println(m1.get(dof));
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(1,"January");
		m2.put(2,"February");
		m2.put(3,"March");
		m2.put(4,"April");
		m2.put(5,"May");
		m2.put(6,"June");
		m2.put(7,"July");
		m2.put(8,"August");
		m2.put(9,"September");
		m2.put(10,"October");
		m2.put(11,"November");
		m2.put(12,"December");
		System.out.println(m2.get(dof));
		
		
		
	}

}
