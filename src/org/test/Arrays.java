package org.test;

public class Arrays {

	public static void main(String[] args) {
		int a[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		
		System.out.println(a.length);
		for (int i = 0; i <a.length; i++)
	{
			sum=sum+a[i];
			
		}	
		System.out.println(sum);
		float x=sum/7;
		System.out.print(x);
		
	}
	}
