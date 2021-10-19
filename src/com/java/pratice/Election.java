package com.java.pratice;

import java.util.Scanner;

public class Election {

  public static void main(String[] args) {
	
	  Scanner competition = new Scanner (System.in);
 
	  System.out.println("Enter your age");
	  int voterage = competition.nextInt();
	  
	  System.out.println("voter registration complete");
	  boolean voterregistration = competition.nextBoolean();
	  
	  if (voterage>=18  &&voterregistration) {
		  
		  System.out.println("He is eligible for vote");
		  
	  } 
	  else {
		  System.out.println("Not eligible for vote");
	  }
		  
	
  }
	}