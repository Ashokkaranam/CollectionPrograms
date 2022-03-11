package com.hashTable;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable
{
   public static void main(String[] args)
   {
	 
	   Hashtable<Integer,String> ht1=new Hashtable<>();
	   ht1.put(1,"Telugu");
	   ht1.put(2, "English");
	   ht1.put(3, "Hind");
	 //  ht1.put(null, null);  //Hashtable not allow null keys,values.
	   System.out.println(ht1);
	    
	   Set<Entry<Integer,String>> entrySet=ht1.entrySet();
	   
	   for(Entry<Integer,String> entry:entrySet)    //for each loop
	   {
		   System.out.println("Numbers : " +entry.getKey()+ "\t\t Languages : "+entry.getValue());
	   }
   }
    
    
}
