package com.tushar;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
n=sc.nextInt();
System.out.println("Enter the second elements");
m=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-1;j++)
{
	System.out.println(" ");
}
for(int j=1;j<=m;j++)
{
	System.out.print(" * ");

System.out.println();
}
}
	}

}
