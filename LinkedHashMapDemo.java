package com.training.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		Map<String, String> treeMap = new TreeMap<>();
		map.put("P", "Pune");
		map.put("C", "Chennai");
		map.put("D", "Delhi");
		map.put("H", "Hyderabad");
		System.out.println("Linked Hashmap=" + map);
		treeMap.put("P", "Pune");
		treeMap.put("C", "Chennai");
		treeMap.put("D", "Delhi");
		treeMap.put("H", "Hyderabad");
		// treeMap.put(null, "abc");//NPE
		treeMap.put("A", null);
		System.out.println("Tree map=" + treeMap);

		Set<Entry<String, String>> entries = treeMap.entrySet();
		Iterator<Entry<String, String>> itr = entries.iterator();
		// (or)
		Iterator<Entry<String, String>> iterator = treeMap.entrySet().iterator();

		Entry<String, String> entry;
		while (iterator.hasNext()) {
			entry = iterator.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

		System.out.println("Traversing with for -each loop");
		for (Entry<String, String> e : entries) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		
		System.out.println();
		for (Entry<String, String> e : treeMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		

	}

}
