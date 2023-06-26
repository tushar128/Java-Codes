package com.tushar;
import java.util.*;

public class chekvowel {
	


	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String vowel;
			Scanner sc =new Scanner("System.in");
			System.out.println("Enter the vowelS :");
			vowel =sc.nextLine();
		     
		      
		    switch(vowel){    
		     
		    case 'A':  
		    break;    
		    case 2: vowelString="E";  
		    break;    
		    case 3: vowelString="I";  
		    break;    
		    case 4: vowelString="O";  
		    break;    
		    case 5: vowelString="U";  
		     break;    
		    default:
		    	System.out.println("Invalid vowel!");    
		    }    
		  
		    System.out.println(vowelString);  
		    
		}



}
