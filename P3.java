package com.tushar;
import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=i;j<=n;j++)
	{
		System.out.print(" "+j+" ");
	}
	System.out.println(" ");
}
	}
}
