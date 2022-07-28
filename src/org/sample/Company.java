package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		List li=new ArrayList();
		
		//to insert value in list
		li.add(10);
		li.add("java");
		li.add(8475698l);
		li.add(84.75f);
		li.add('c');
		li.add(10);
		li.add(null);
		
		// to print list values
		System.out.println(li);
		//size
		int size = li.size();
		System.out.println(size);
		//indexOf
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		//lastindexOF
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		//contains
		boolean contains = li.contains('c');
		System.out.println(contains);
		//add(index,value)
		li.add(1,"selenium");
		System.out.println(li);
		//set
		li.set(0,100);
		System.out.println(li);
		//remove
		li.remove(1);
		System.out.println(li);
		//get
		Object object = li.get(1);
		System.out.println(object);
		//list
		List a=new ArrayList();
		System.out.println(a);
		//addAll
		a.addAll(li);
		a.add(20.32f);
		System.out.println(a);
		//retainAll()
		a.retainAll(li);
		System.out.println(a);
		
		a.add("maveen");
		System.out.println(a);
		//removeAll
		a.removeAll(li);
		System.out.println(a);
		System.out.println("for loop:"+"\n"+"*********");
		// for loop
		for (int i=0;i<li.size();i++) {
			Object object2 = li.get(i);
			System.out.println(object2);
		}
		//enhanced for loop
		System.out.println("enhanched for loop;"+"\n"+"*********");
	   
		for (Object object2 : li) {
			System.out.println(object2);
		}
		
		
		
		
		
		
		
	}

}
