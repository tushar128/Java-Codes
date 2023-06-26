package com.tushar;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r,n;
System.out.print("enter the number");
Scanner sc =new Scanner(System.in);
n=sc.nextInt();
while(n>0)
{
r=n %10;
System.out.print(r+" ");
n=n/10;
	}
	}
}
