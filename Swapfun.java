package com.tushar;
// swap without third variable in function ....
//cal by value
public class Swapfun {
	 static int swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swap the numbers "+a+" "+b+" ");
		return 0 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("swap the numbers1 "+swap(10,20)+" ");

	}

}
