package com.ss.lambdas.functional.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PartOne {

	public static void main(String[] args) {
	    
		
		System.out.println("1)\n");
		System.out.println("-1.1");
		String[] len = {"sdf","qwewa","oiweiu","aaaaaaaa","as","kjsdhfkjshdfkjsdf"};
		Arrays.sort(len,(String s1,String s2)->s1.length()-s2.length());
		for(String s: len) {
			System.out.println(s);
		}
		
		System.out.println("\n--1.2)");
		String[] alpha = {"you","junk","compuer","ascii","wonder","zap","crack","sizzle"};
		
		Arrays.sort(alpha);
		for(String s: alpha)
		{
		System.out.println("  "+s);
		}
		
		System.out.println("\n---1.3))");
		String[] sArray  = {"ever","wow","end","atom","Awishefull","zero","artful"};
		String[] sArray2 = sArray.clone();
		//sArray = Arrays.stream(sArray).reduce(sArray,(s1,s2)->s1.length() > s2.length() ? s1:s2);
		//sArray = Arrays.stream(sArray).filter(s->s.length()>s.length()).toArray(String[]::new);
		//sArray = Arrays.sort(sArray,(String s1, String s2)s1.length() - s2.length());
		sArray = Arrays.stream(sArray).filter(s->s.contains("e")).toArray(String[]::new);
	    sArray2 = Arrays.stream(sArray2).filter(s->!s.contains("e")).toArray(String[]::new);
		for(String s: sArray) {
			System.out.println("   "+s);
		}
		for(String s: sArray2) {
			System.out.println("   "+s);
		}
		
		
		System.out.println();
		
		
		
		
		System.out.println("3)");
		String[] array = {"ant","bug","anteater","ark","boat","app","silver"};
		
		array = Arrays.stream(array).filter(s->s.startsWith("a")).filter(s->s.length()<=3).toArray(String[]::new);
		
		for(String s:array) {
			System.out.println(s);
		}
		

	}

}
