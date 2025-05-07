package userinputpractice;

import java.util.Scanner;

public class userAmstrongno {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("eneter the n value: ");
		
		int n=sc.nextInt();
		int a=n;
		int r=0;
		while(n>0) {
			
			int k=n%10;
			r=r+k*k*k;
			
			n=n/10;
			
		}
		if(r==a) {
		System.out.println("its is a Amstrong No : "+ r);
		}else {
			System.out.println("it is not a Amstrong NO");
		}
	}
	
}
