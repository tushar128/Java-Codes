package com.tushar;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" "+c+" ");
		c++;
	}
	System.out.println(" ");
}
	}
}


