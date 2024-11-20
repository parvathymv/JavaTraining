package com.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Product implements Comparable<Product> 
{
	private String code;
	private String name;
	private double price;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Product [code=%s, name=%s, price=%s]", code, name, price);
	}
	
	
//p1.compareTo(p2)
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		int result=0;
		if(this.price==o.price)
			result=0;
		else if(this.price>o.price)
			result=1;
		else
			result=-1;
		//result=this.name.compareTo(o.name);
		
		return result;
	}


	

//p1.compareTo(p2)

}

class NameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		int result;
		result = o1.getName().compareTo(o2.getName());
		return result;
	}

}

class PriceDescendingComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		int result = 0;
		if (o1.getPrice() == o2.getPrice())
			result = 0;
		else if (o1.getPrice() > o2.getPrice())
			result = -1;
		else
			result = 1;

		return result;
	}
}

public class ListOfObjects {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		NameComparator nameComparator = new NameComparator();
		// PriceDescendingComparator priceDescComparator = new
		// PriceDescendingComparator();
		int n;
		String code, name;
		double price;
		Product p = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener the number of products");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter product code,name & price");
			code = sc.next();
			name = sc.next();
			price = sc.nextDouble();
			p = new Product();
			p.setCode(code);
			p.setName(name);
			p.setPrice(price);
			productList.add(p);
		}
		System.out.println("Product list");
		for (Product obj : productList) {
			System.out.println(obj);
		}

		Collections.sort(productList);// Comparable
		System.out.println("Sorting based on price in ascending order");
		for (Product obj : productList) {
			System.out.println(obj);
		}
		
		Collections.sort(productList, new NameComparator());

		System.out.println("Sorting based on product name");
		for (Product obj : productList) {
			System.out.println(obj);
		}

		
		 Collections.sort(productList, new PriceDescendingComparator()); //Comparator
		  System.out.println("Sorting based on product price -descending order"); 
		 for (Product obj : productList) 
		 { System.out.println(obj); }
		  
		/*  Collections.sort(productList, nameComparator); //Comparator
		  System.out.println("Sorting based on product name");
		  for (Product obj :
		  productList) { System.out.println(obj); }
		  */
		 

	}
}