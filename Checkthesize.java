package com.tushar;

import java.util.Scanner;

public class Checkthesize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		String size;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Strings");
number=sc.nextInt();
switch(number)
{
case 29:
	size ="small";
	break;
case 49:
size="medium";
   break;
case 59:
size="Greater";
 break;
 default:
	 size="Unknown";
	 break;
}
	System.out.println("size:=" +size);
	}


}
