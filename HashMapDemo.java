package com.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, Double> map = new HashMap<>();
		Map<Integer, Double> map1 = new HashMap<>();
		map.put(10001, 34000.00);
		map.put(10004, 22000.50);
		System.out.println("No of elements=" + map.size());
		System.out.println("Map =" + map);
		map.put(10005, 45000.50);
		System.out.println("Map =" + map);
		map.put(10005, 22500.50);
	//	map.put(null, null);
		map.put(10002, 23500.00);
		System.out.println("After adding elements map=" + map);
		System.out.println("Salary of 10001=" + map.get(10001));
		System.out.println("Salary of 10000=" + map.get(10000));
		System.out.println("Map contains 10000 =" + map.containsKey(10000));
		System.out.println("Map contains 10001 =" + map.containsKey(10001));
		System.out.println("Map contains 20000 =" + map.containsValue(20000.00));
		System.out.println("Map contains 22500.50 =" + map.containsValue(22500.50));
		map.remove(10001);
		System.out.println("After removing 10001 map= " + map);
		map1.put(200001, 24000.90);
		System.out.println("Map1 ="+map1);
		map1.putAll(map);
		System.out.println("After appending map to map1 = "+map1);
		System.out.println("Map1 is empty="+map1.isEmpty());
		map1.clear();
		System.out.println("Map1 is empty="+map1.isEmpty());
		//Iterator<Integer,Double> itr=map.iterator();
		//map.keySet()-returns all the keys as a set
		//map.entrySet();-returns keys and values wrapped as entry
		//map.values();-returns only the values from the map
		
		//Set<Integer> keys=map.keySet();
		//Iterator<Integer> itr=keys.iterator();
		
		
		Iterator<Integer> itr=	map.keySet().iterator();
		int key;
		double value;
		while(itr.hasNext())
		{
			key=itr.next();
			value=map.get(key);
			System.out.println(key +"="+ value);
		}
	}

}
