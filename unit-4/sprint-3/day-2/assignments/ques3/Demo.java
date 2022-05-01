package com.S3D2.ques3;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m) throws InvalidMonthException{
		
		switch (m) {

        case JAN:
            System.out.println("January is cold");
            break;

        case FEB:
            System.out.println("Februray is short");
            break;
            
        case MAR:
            System.out.println("March is OK");
            break;


        case APR:
            System.out.println("April is tiring");
            break;


        case MAY:
            System.out.println("May is even more boring");
            break;


        case JUN:
            System.out.println("June means work work and work");
            break;


        case JUL:
            System.out.println("July makes me happy");
            break;
            
        case AUG:
        	  System.out.println("It rains");
        	  break;
        	  
        case SEP:
      	  System.out.println("It start geting cold");
      	  break;
      	  
        case OCT:
      	  System.out.println("It feels weird");
      	  break;
      	  
      	  
        case NOV:
      	  System.out.println("It's chilling");
      	  break;
      	  
        case DEC:
      	  System.out.println("Everything freezes");
      	  break;
      	  
      	  default:
      		InvalidMonthException er=new InvalidMonthException("Invalid Month Entered, Check Spell");
      		  throw er;
      		 

		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month");
		String inp=sc.next().toUpperCase();
		
		try {
			Month m1=Month.valueOf(inp);
			Demo d1=new Demo();
			d1.showDetails(m1);
		}
		catch(InvalidMonthException er) {
			er.getMessage();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Month Entered ");
		} {
			
		}

	}

}
