package com.tushar;

import java.util.Scanner;

// call by value
public class Mulfun {
static int mul(int a,int b)
{
	return a*b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("enter nthen first elements x");
x=sc.nextInt();
System.out.println("enter nthen second elements x");
y=sc.nextInt();

int result=mul(x,y);
System.out.println(" multiplication " +result+ " ");
	}

}
