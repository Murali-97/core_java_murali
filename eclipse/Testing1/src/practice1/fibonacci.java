package practice1;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n=8;
		
		int first=0, second=1, next;
		
		for(int i=1; i<=n;i++) {
			
			System.out.print(first+ " ");
			
			next=first+second;
			first=second;
			second=next;			
			
			
		}
	}

}
