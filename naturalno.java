package com.tushar;

import java.util.Scanner;

public class naturalno {
public static void main(String[] args)
{
	int n ,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number");
	n=sc.nextInt();
	for(int i=1 ;i<n;i++)
	{
		sum=sum+i;
	}
	System.out.println("addittion"+n+" is"+sum+" ");
}
}
