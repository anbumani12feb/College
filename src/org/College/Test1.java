package org.College;

public class Test1 {

public static void main(String[] args) {
	String s= "Malayalam";
	String r="";
	for (int i= s.length()-1; i>=0;i--) {
		r=r+s.charAt(i);
	}
	System.out.println(r);
	if (s.equals(r)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	
	String st= "987654";
	StringBuilder str = new StringBuilder();
	StringBuilder append = str.append(st);
	System.out.println(append.reverse());
	
	char a= "Mani1234";
	int count = 0;
	
	StringBuilder n = new StringBuilder();
	for (int i = 0; i < a.length(); i++) {
		char charAt = a.charAt(i);
		if (Character.isDigit(charAt)) {
			 n.append(charAt);
			count++;
		}
		
		
	}
	System.out.println(n);
	System.out.println(count);
	
	 String b = "Mani1234";
	 StringBuilder m = new StringBuilder();
	  for (int i = 0; i < b.length(); i++) {
		  char charA = b.charAt(i);
		if (Character.isAlphabetic(charA)) {
			m.append(charA);
			
		}  
	} 
	System.out.println(m);
	
	
		
	}
	

	}
   
  
   
   }
   


