package org.College;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class test {
	
	public static void main(String[] args) {
		
		String s = "Helloggood";
		int l=s.length()/2;
		System.out.println(l);
		char at = s.charAt(l);
		System.out.println(at);
		System.out.println(s.toUpperCase());
		int indexOf = s.indexOf('o');
		System.out.println(indexOf);
	
		
		String substring = s.substring(2);
		String string = s.substring(0, 2);
		char charAt = string.charAt(1);
		System.out.println(substring);
		System.out.println(string);
		System.out.println(charAt);
		
		String s1= "Manikandan";
		int indexOf2 = s1.indexOf('k');
		System.out.println(indexOf2);
		String substring2 = s1.substring(4);
		System.out.println(substring2);
		
		String s2= "GoterwuwhsoousysusoockhhsvchscshhoBVBgxfaKKBHooD";
		char w = 'o';
		int count = 0;
		
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i)==w) {
				count++;
				if (count==6) {
					System.out.println(s2.charAt(i)+ "index "+i);
					
					break;
				}
			}
			
		}
		
		
		String s3= "GoterwuwhsoousysusoockhhsvchscshhoBVBgxfaKKBHooD";
		char w1 = 'o';
		int count1 = 0;
		for (int i = 0; i < s3.length(); i++) {
			if(s3.charAt(i)==w1) {
				count1++;
			}
			
		}
		System.out.println(count1);
		
		
		String h = "India,China,Canada";
		int indexOf21 = h.indexOf("India");
		
		System.out.println(indexOf21);
		int of = h.indexOf("China");
		System.out.println(of);
		int length = h.length();
		System.out.println(length);
		System.out.println(h.indexOf("Canada"));
		System.out.println(h.lastIndexOf("a"));
		
		String string2 = h.substring(0, 11);
		System.out.println(string2);
		System.out.println(h.charAt(11 ));
		
		boolean b = h.contains("India");
		if (b==true) {
			System.out.println("India");
		}
		else {
			System.out.println("Not found");
		}
		boolean c = h.contains("China");
		if (c==true) {
			System.out.println("China");
		}
		else {
			System.out.println("Not found");
		}
		
		String d = "@WonderBar";
		String y = "";
		String[] split = d.split("@", 2);
		System.out.println(split);
		for (int i=d.length()-1;i>=0;i--) {
			y=y+d.charAt(i);
		}
		System.out.println(y);
		
		
		String m = "GowthamtGo";
		String v = "t";
		
		boolean contains = m.contains("t");
	if (contains==true) {
		String replace = m.replace("t", "");
		String trim = replace.trim();
		System.out.println(trim);
	
		 
		
		
	}
	
	boolean with = m.startsWith("Go");
	if (with==true) {
		String substring3 = m.substring(3);
		System.out.println(substring3);
	}
	
	String x = "RoRgan";
	String ss = "";
	boolean contains2 = x.contains("R");
	if (contains2==true) {
		int i = x.indexOf("R");
		if (i==0) {
			String replace = x.replace("R", "r");
			System.out.println(replace);
		}
		
	}
	
	
	}
		
	
	
	 
	 
	
}
	
