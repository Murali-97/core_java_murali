package userinputpractice;

import java.util.Scanner;

public class evenandodd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		
		for(int i=1; i<n;i++) {
			
			if(i%2==0) {
				
				System.out.println("this are even numbers "+i);
			}
		}
	}
	
}
