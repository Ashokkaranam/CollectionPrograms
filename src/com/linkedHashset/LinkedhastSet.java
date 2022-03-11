package com.linkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhastSet
{
    public static void main(String[] args) 
    {
		LinkedHashSet<String> link=new LinkedHashSet<>();
		 link.add("a");
		 link.add("b");
		 link.add("c");
		 link.add("d");
		 System.out.println(link);
		  
		  link.remove("b");
		  
		  Iterator<String> itr=link.iterator();
		  
		  while(itr.hasNext())
		  {
			  String value=itr.next();
			  System.out.println("value: "+value);
		  }
	}
}
