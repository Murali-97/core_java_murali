package userinputpractice;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the n value: ");
		int n=sc.nextInt();
//		int count=0;
//		for(int i=2;i<n;i++) {
//			
//			if(n%i==0){
//				count++;
//			}	
//			}
//		if(count==0)	{
//			System.out.println(" it is a prime number: "+ n);
//		}else {
//			System.out.println(" it is not a prime number: "+ n);
//		}
		
		
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					count++;
				}
				
			}
		}
		
		
	}
}
