package com.tushar;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[3];
Scanner sc =new Scanner(System.in);
System.out.println("Enter the elemenets");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
System.out.print("array elements");
for(int i=0;i<a.length;i++)
{
	System.out.print(" \n"+a[i]+" ");
}
System.out.println("\n print lenth of arry"  +a.length  );
	}

}
