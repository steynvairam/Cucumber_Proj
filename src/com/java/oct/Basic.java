package com.java.oct;

public class Basic {

public void add() {

	int a = 10;
	int b = 5;
	
	int result = a+b;
	System.out.println(a+b);
	
  
}	
private void sub() {

	int c = 10;
	int d =5;
	
	int result = c-d;
	System.out.println(c-d);
}

  private void mult() {
   
	  int e = 10;
	  int f = 5;
	  
	  int result = e*f;
	  System.out.println(e*f);
			  
}

   public static void main(String[] args) {
	
	Basic data = new Basic();
	data.add();
	data.sub();
	data.mult();
}

}
