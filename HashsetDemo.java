package com.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashsetDemo {

	/*static void method(List list)
	{
		
	}*/
	
	public static void main(String[] args) {
	Set<Integer> hashset1=new HashSet<>();
	Set<Integer> hashset2=new LinkedHashSet<>();
	
	//List list=new LinkedList<>();
	//method(list);
	
	hashset1.add(10);
	hashset1.add(20);
	hashset1.add(30);
	hashset1.add(10);
	hashset1.add(10);
	hashset1.add(null);
	hashset1.add(null);
	
	System.out.println("HashSet ="+hashset1);
	hashset2.add(10);
	hashset2.add(20);
	hashset2.add(30);
	hashset2.add(10);
	hashset2.add(10);
	hashset2.add(null);
	hashset2.add(null);
	System.out.println("LinkedHashset ="+hashset2);
	System.out.println(hashset1.contains(10));
	System.out.println(hashset1.isEmpty());
	for(Integer i:hashset1)
	{
		System.out.println(i);
	}
	Iterator<Integer> itr=hashset1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	
	}

}
