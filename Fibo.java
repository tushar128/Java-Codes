package com.tushar;

import java.util.*;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter thenumber");

		for(int i=0;i<=n;i++)
		{
			System .out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
