package userinputpractice;

import java.util.Scanner;

public class userpalindromeno {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the n value : ");
	int n= sc.nextInt();
	int a=n;
	int k=0;
	while(n>0) {
		
	int r=n%10;
	
	k=k*10+r;
	n=n/10;
	}
	if(k==a) {
		
	System.out.println("it is a palindrome number");
	}
	else {
		System.out.println("it is not a palindrome number");
	}
	}
}
