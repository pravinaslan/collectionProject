package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List v=new ArrayList();
		v.add("pravin");
		v.add(27);
		v.add("be civil engineering");
		v.add('r');
		
		List a=new ArrayList();
		a.addAll(v);
		a.add("maven");
		System.out.println(a);
		a.retainAll(v);
		System.out.println(a);
		
		a.add("java");
		a.removeAll(v);
		System.out.println(a);
		System.out.println("for loop*******");
		
		for(int i=0;i<v.size();i++) {
			Object object2 = v.get(i);
			System.out.println(object2);
			
		}
		System.out.println("enhanced for loop**************");
		
		for  (Object xy : v) {
			System.out.println(xy);
			
			
		}
		
		
		
		
	}

}
