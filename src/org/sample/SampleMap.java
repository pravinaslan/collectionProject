package org.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleMap {
	public static void main(String[] args) {
		
		Map<String,Integer>x=new HashMap();
		x.put("mi",5);
		x.put("csk",4);
		x.put("gt",6);
		x.put("kkr",8);
		System.out.println(x);
		
		Set<String> keySet = x.keySet();
		System.out.println(keySet);
		
		Set<Entry<String, Integer>> a = x.entrySet();
		
		for  (Entry<String, Integer> b :a) {
			System.out.println(b);
			String key = b.getKey();
			
		}
		
	}

}
