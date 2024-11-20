package com.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		TreeSet set = new TreeSet();
		ArrayList list2 = new ArrayList();
		
		list.add(4);
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(100);
		list.add(10);
		// list.add(45.56);
		list1.add("one");
		list1.add("two");
		list1.add("three");

		list2.add("one");
		list2.add("two");
		list2.add("three");

		list3.add(10);
		list3.add(5);
		list3.add(20);
		list3.add(50);

		
		/* set.add(10); 
		 set.add("hello"); 
		 *///ClassCastException set.add(34.56);
		 
		System.out.println("without generics ");
		String[] str = new String[list.size()];
		for (int i = 0; i < list2.size(); i++) {
			str[i] = (String) list2.get(i); // type casting
		}
		System.out.println("with generics ");
		for (int i = 0; i < list1.size(); i++) {
			str[i] = list1.get(i);
		}

		System.out.println("List operations");//
		System.out.println("List 1 =" + list);
		System.out.println("List  2=" + list3);
		// list.addAll(list3);
		// System.out.println("After addall list="+list);
		// list.retainAll(list3);
		// System.out.println("After retainall list="+list);
		// list.removeAll(list3);
		// System.out.println("After removeall list="+list);
		list.remove(0);
		System.out.println("After removing 1 element list=" + list);
		list.remove(new Integer(20));

		System.out.println("After removing 20 list=" + list);
		Collections.sort(list);
		System.out.println("After sorting list=" + list);
		Collections.reverse(list);
		System.out.println("After reversing list=" + list);
		System.out.println("Frequency of 10 ="+Collections.frequency(list, 10));
	

	}

}
