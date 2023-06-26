package com.tushar;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {

	int n,c,sum=0,r;
	System.out.println("enter the number");
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();
	c=n;
	while(n>0)
			{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
			}
	if(c==sum)
		
	{
		System.out.println("this is palindrome no");
	}
	else{ 
		
		System.out.print("this is not a palindrone no.");
	}
}
}