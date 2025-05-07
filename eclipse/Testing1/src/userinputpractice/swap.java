package userinputpractice;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter the a value: ");
		 int a=sc.nextInt();
		 System.out.println("enter the b value: ");
		 int b=sc.nextInt();
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("AFter swap the A value: "+ a);
		 
		 System.out.println("AFter swap the  value: "+ b);
		 
	}
	
	
}
