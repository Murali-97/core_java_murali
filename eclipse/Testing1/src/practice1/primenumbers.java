package practice1;

public class primenumbers {

	public static void main(String[] args) {
		
		
//		int n=11;
//		
//		for(int i=1; i<n;i++)
//		{
//		 if(n%i==0) {
//			 
//			count++;
//		 }
//		}
//		 if(count==2) {
//			 
//			 System.out.println(n +" : is not a prime number");
//		 }
//		 else
//		 {
//		 System.out.println(n +" : is a prime number");
//		 }	
		
		for(int n=1;n<=20;n++) {
			int count=0;
			for(int i=2;i<n;i++) {
				
				if(n%i==0)
				{
					count++;
				
			}
		}
			if(count ==0) {
				System.out.println(n +": it is a prime number");
				
			}
			else {
				System.out.println(n +": it is not a prime number");
		}
		}
	}

}
