package com.tushar;

import java.util.Scanner;

public class Fibofun {
 static int fibo(int n)
{
	 int a=0,b=1,c ;

	 for(int i=0;i<=n;i++)
	 {
	 	System.out.println(a+" ");
	 	c=a+b;
	 	a=b;
	 	b=c;
	 }
	return n;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter the number");
//int n = sc.nextInt();
/*int a=0,b=1,c ;

for(int i=0;i<=n;i++)
{
	System.out.println(a+" ");
	c=a+b;
	a=b;
	b=c;
}*/
System.out.println("fibo naci series"+fibo(10)+" ");
	}

}
