package package8;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m1;
		
		 Scanner textscan=new Scanner(System.in);
		 
		 System.out.println("Enter a Month in lower case");
		 
		 m1=textscan.nextLine();
		 
		
		 
		switch(m1)
		{
		case "january":
			System.out.print("has 31 days");
			break;
		case "february":
			System.out.print("has 29 or 28 days");
			break;
		case "march":
			System.out.print("has 31 days");
			break;
		case "april":
			System.out.print("has 30 days");	
			break;
		case "may":
			System.out.print("has 31 days");
			break;
		case "june":
			System.out.print("has 30 days");
			break;
		case "july":
			System.out.print("has 31 days");	
			break;
		case "august":
			System.out.print("has 31 days");
			break;
		case "september":
			System.out.print("has 30 days");
			break;
		case "october":
			System.out.print("has 31 days");	
			break;
		case "november":
			System.out.print("has 30 days");
			break;
		case "december":
			System.out.print("has 31 days");
			break;
		default:
			System.out.print("Please Enter a valid Month name");
		    break;
			
			
		}
		
		

	}

}
