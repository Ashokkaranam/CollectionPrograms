package com.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap
{
    public static void main(String[] args)
    {
		ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
		map.put(101, "apple");
		map.put(102, "banana");
		map.put(103, "coconut");
		map.put(101, "graps");  //Here duplicate key value is replaced by original key value.
		
		System.out.println(map);
		map.remove(102);
		System.out.println(map);
		
		map.putIfAbsent(104, "banana");
		System.out.println(map);
		
		
		
	}
}
