package com.fb.TestSuite;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class mapTest {

	public static void main(String[] args) {

		/*Map<String,String> mapList=new HashMap<String, String>();
		
		mapList.put("Abhishek", "Tester");
		mapList.put("Kaku", "Developer");
		mapList.put("Ab", "Tester");
		
		System.out.println(mapList);*/
		
		
		
		Map<String,List<String>> mapListTwo=new HashMap<String,List<String>>();
		
		List<String> object = new LinkedList<String>();
		object.add("John");
		object.add("Cena");
		
		List<String> objectTwo = new LinkedList<String>();
		objectTwo.add("Abhiske");
		objectTwo.add("Singh");
		mapListTwo.put("listOne", object);
		mapListTwo.put("listTWo", objectTwo);
		
		System.out.println(mapListTwo);
		String key="listTWo";

		//Iterator<Entry<String, List<String>>> abc=mapListTwo.entrySet().iterator();
		
		for (Entry<String, List<String>> entry : mapListTwo.entrySet()) {
			
			if(entry.getKey().equalsIgnoreCase(key)){
				List<String>output=entry.getValue();
				System.out.println(output.get(0));
			}
		}
	}

}
