package userinputpractice;

import java.util.Scanner;

public class uservaluefibonaicc {
           
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first value ");
		int first=sc.nextInt();
		System.out.println("enter the second value");
		int second=sc.nextInt();
		for(int i=1;i<8;i++) {
		int n=first+second;
		System.out.print(first);
		first=second;
		second=n;
		}
	}
	
}
