package com.hashmap;

import java.util.HashMap;

public class Hashmap
{
    public static void main(String[] args)
    {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("ashok",10);
		map.put("kumar",20);
		map.put(null,30);
   map.put(null, 40);//Hash map allows only one null key and more null values..In this case first null is replace by second null value. 
		
		System.out.println("Size of map is: "+map.size());
		  
		System.out.println(map);
		
		if(map.containsKey("ashok"))
		{
			int a =map.get("ashok");
			
			System.out.println("value of key -ashok- is: "+a);
		}
	}
}
