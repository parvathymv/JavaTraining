package com.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		ArrayList list1 = new ArrayList<>();
	/*	int a;
		Integer obj=new Integer(10);
		a=obj;*/
		list.add(12);
		list.add(45.6);
		list.add("hello");
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(15);
		list.add(null);
		
		System.out.println("ArrayList " + list);
		list.add(2, 100);
		System.out.println("List size=" + list.size());
		System.out.println("After inserting 100 in 2nd index " + list);
		System.out.println("Index of first occurrence of 10 10 " + list.indexOf(10));
		System.out.println("Index of last occurrence of 10 " + list.lastIndexOf(10));
		System.out.println("ArrayList contains 10 = " + list.contains(10));
		System.out.println("ArrayList contains 20 = " + list.contains(20));
		list1.add("new list");
		System.out.println("New list =" + list1);
		list1.addAll(list);
		System.out.println("After appending list with list1 = " + list1);
		list1.clear();
		System.out.println("After clearing elements of list1 =" + list1);
		System.out.println(" 4th eleemnt in the list =" + list.get(3));
		System.out.println(list + " is empty " + list.isEmpty());
		System.out.println(list1 + " is empty " + list1.isEmpty());
		System.out.println("sublist from 2 index to 4th index " + list.subList(2, 5));
		list.remove(2);
		System.out.println("After deleting element in 2nd index=" + list);
		System.out.println("Traversing array list using index-for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println();
		System.out.println("Traversing arraylist with for-each loop");
		for (Object var : list) {
			System.out.print(var+ " ");
		}
		System.out.println();
		System.out.println("Traversing arraylist with iterator");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Object obj = itr.next();
			System.out.print(obj +" ");

		}
		System.out.println();

		ListIterator listItr = list.listIterator();
		System.out.println("Traversing in the forward direction");
		while (listItr.hasNext()) {
			System.out.print(listItr.next() + " ");
		}
		System.out.println();
		System.out.println("Traversing in the backward direction");
		while (listItr.hasPrevious()) {
			System.out.print(listItr.previous() + " ");
		}

	}

}
