package com.arrayPrograms;

public class Array 
{
    public static void main(String[] args)
    {
		int [] arr= {1,2,3,4};
		int[] arr1=new int[5];
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("Array elements are:"+arr[i]);
		
		
		}
		for(int value:arr)
		{
			System.out.println(value);
		}
	}
}
