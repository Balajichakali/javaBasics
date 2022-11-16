
package com.corejava.oops;

//step-1
import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		
	      //step‐2
		   Scanner s=new Scanner(System.in);
		   
		   //step‐3
		   //To read string value
		   System.out.println("Enter name ");
		   String name=s.nextLine();
		   
		   // To read Int value
		   System.out.println("Enter age ");
		   int age=s.nextInt();
		   
		   //To read float value
		   System.out.println("Enter percentage ");
		   float percentage=s.nextFloat();
		   
		   //To read boolean 
		   System.out.println("Enter result status ");
		   boolean result=s.nextBoolean();
		   
		   //To read long value
		   System.out.println("Enter contact number ");
		   long contact=s.nextLong();
		   
		   //To read char value
		   char gender;
		   System.out.println("Enter Gender ");
		   gender=s.next().charAt(0);
		   
		   System.out.println("Student Details Entered by you are");
		   System.out.println("Name: "+name);
		   System.out.println("Age : "+age);
		   System.out.println("Gender : "+gender);
		   System.out.println("Contact : "+contact);
		   System.out.println("Score : "+percentage);
		   System.out.println("Result: "+result);
		  }
	
		
	}

