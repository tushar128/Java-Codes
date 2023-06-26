package com.tushar;

import java.util.Scanner;

public class arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,arm=0,c,r;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
		r=n%10;
		arm=(r*r*r)+arm;
		n=n/10;
		}
		if(c==arm)
		{
			System.out.println("it is an arm strong no.");
		}
		else
			System.out.print("not arm strong no");
	}

}
