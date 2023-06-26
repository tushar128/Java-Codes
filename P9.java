package com.tushar;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");

n=sc.nextInt();
for(int i=1;i<n;i++)
{
	for(int j=1;j<=n;j++)
	{
		System.out.print("*");
	}
	System.out.println(" ");
}
	}

}
