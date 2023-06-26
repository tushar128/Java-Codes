package com.tushar;

import java.util.Scanner;

public class Printthesumofevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sumE=0,sumO=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				
				sumE=sumE+i;
			}
			else
				
				
				sumO=sumO+i;
				
	
		}
		System.out.println("sum of even no"+n+"is"+sumE+" ");
		System.out.println("sum of odd no"+n+"is"+sumO+" ");


	}

}
