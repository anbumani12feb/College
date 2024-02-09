package org.College;

public class Test2 {
	public static void main(String[] args) {
	//Even 	
		int a = 100;
		int count  =0;
	
		for (int i = 0; i <=100; i++) {
			if (i%2==0) {
				
				count++;
			}
			
		}
		System.out.println(count);
		
		//Odd 
		int coun=0;
		for (int i = 0; i <=100; i++) {
			if (i%2!=0) {
				
				coun++;
			}
		}
		System.out.println(coun);
		
	//Add	
		int sum=0;
		for (int i = 0; i <=10; i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
		
		
	//int reverse	
		int n=123456789;
		int r =0;
		
		while (n>0) {
			int m = n%10;
			r=(r*10)+m;
			n=n/10;
			
		}
		System.out.println(r);
		
		// int count 
		int g=1234;
		int c =0;
		
		while (g>0) {
			c++;
			g/=10;
		}
		System.out.println(c);
		
		
				}
	
	
	}

