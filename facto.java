package com.tushar;

import java.util.Scanner;

public class facto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fact=1, n;
System.out.println("enterv the number");

Scanner sc = new Scanner(System.in);
n=sc.nextInt();
if(n<0)
{
	System.out.println("invalid");
}
else
	
for(int i=1 ;i<=n;i++)
{
	fact=fact*i;

}
System.out.println(" "+n +"is" +fact+ " ");

	}

}
