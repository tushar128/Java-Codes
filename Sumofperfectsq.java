package com.tushar;

import java.util.Scanner;

public class Sumofperfectsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n ,sum=0;
Scanner sc =new Scanner(System.in);
n= sc.nextInt();
for(int i=0;i<n;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
	}
}
if(sum==n)
{
	System.out.print("it is an perfect sq");
}
else
	System.out.println("it is not a perfect sq");
	}

}
