package org.College;

public class test3 {
	
	public static void main(String[] args) {
		//Armstrong
		int v =153;
		int temp=v;
		int ar=0;
		
		while (v>0) {
			int n=v%10;
			ar=ar+(n*n*n);
			v/=10;
			}
		
		if (ar==temp) {
			System.out.println("Armstong number");
		} else {

			System.out.println("not Armstrong");
		}
		
		//Sum
		int num=12345;
		int sum=0;
		while (num>0) {
			int n=num%10;
			sum = sum+n;
			num/=10;
					
		}
		System.out.println(sum);
		//Swap
		int a=1;
		int b=2;
		int te=a;
		a=b;
		b=te;
		
		System.out.println(a);
		System.out.println(b);
		
		//prime 
		
		int e=20;
		int count=0;
		
		
		for (int i=2; i<=e/2; i++) {
			if (e%2==0) {
			count++;	
			
		}
			}
		
		if (count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		
}
