package com.tushar;

import java.util.Scanner;

public class Perfectsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,flag=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	if(n==i*i)
	{
		flag=1;
		break;
	}
}
if(flag==1)
{
	System.out.println(" it is an perfect sqr no");
}
else
	System.out.println("it is not perfect sqr  no");
	}

}
