package com.tushar;

import java.util.*;

public class Vowelswichcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vowel;
		Scanner sc =new Scanner("System.in");
		System.out.println("Enter the vowelS :");
		vowel =sc.nextInt();
	    String vowelString = null ;  
	      
	    switch(vowel){    
	     
	    case 1: vowelString="A";  
	    break;    
	    case 2: vowelString="E";  
	    break;    
	    case 3: vowelString="I";  
	    break;    
	    case 4: vowelString="O";  
	    break;    
	    case 5: vowelString="U";  
	     break;    
	    default:System.out.println("Invalid vowel!");    
	    }    
	  System.out.println(vowelString);
	}
}