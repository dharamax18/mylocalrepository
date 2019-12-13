package com.scpn.java.array;

public class ArrayDemo {

	
	public static void main(String[] args) {
		
		int [] arr = {8,4,8,2,6,8,8,1,8,3,8};
		int max = 0;
		int count = 1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) {
				
				max = arr[i];
				
			}else if(arr[i] == max) {
				count++;
			}
		}
		System.out.println("max number is "+max+" and is present in array "+count+" times");
		System.out.println("Hello");
		System.out.println("hii.....");
		System.out.println("JAI SHRI RAM!!!.....");
	}
	
}
