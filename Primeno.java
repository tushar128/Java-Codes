package com.tushar;
import java.util.*;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c=0;
System.out.println("Enter the number");
Scanner sc=new Scanner (System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		c++;
	}
		
}
if(c==2)
{
	System.out.print("prime no");
	

//*if(c==1)
//{
	//System.out.println("not a prine and not composite no");
//}
}
else
	                System.out.print("not prime no");
	}

}
