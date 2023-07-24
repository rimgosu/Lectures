package com.model;

public class test {
	
	public static void main(String[] args) {
		String a = "programming";
		String b = "programming";
		String c = new String("programming");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		if(a==b)
			System.out.println("asdsa");
	}
}
