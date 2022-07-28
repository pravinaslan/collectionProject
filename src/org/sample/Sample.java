package org.sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Sample {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		m.put("rr",6);
		m.put("kkr",6);
		m.put("gt",6);
		m.put("mi",0);
		m.put("mi",8);
		m.put("csk",null);
		m.put(null,null);
		m.put(null,30);
		
		// to print all the pair
		System.out.println(m);
		
		Map<String,Integer> m1=new LinkedHashMap<String,Integer>();//insertion oreder
		m1.put("rr",6);
		m1.put("kkr",6);
		m1.put("gt",6);
		m1.put("mi",0);
		m1.put("mi",8);
		m1.put("csk",null);
		m1.put(null,null);
		m1.put(null,30);
		System.out.println(m1);
		
//		//Treemap
//		
//		Map<String,Integer> m2=new TreeMap();//acending oreder of key
//		m2.put("rr",6);
//		m2.put("kkr",6);
//		m2.put("gt",6);
//		m2.put("mi",0);
//		m2.put("mi",8);
//		m2.put("csk",null);
//		m2.put(null,null);
//		m2.put(null,30);
		
		
		
		System.out.println("iteration of map***************");
		Set<Entry<String, Integer>> entrySet = m1.entrySet();
		for  (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
			
			
			String c = entry.getKey();
			System.out.println(c);
			
			
			Integer value = entry.getValue();
			System.out.println(value);
			
			
			
			
			
		}
		
		
	}
	
	

	
	

}
