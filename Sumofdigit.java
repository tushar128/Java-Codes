package com.tushar;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0,r;
System.out.println("enter the number");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
while(n>0)
{
	r=n%10;
	sum=sum+r;
	n=n/10;
	
}
System.out.println(" "+sum+" "); 
	}

}
	
	
