package practice1;

public class noofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123,a,i=0;
		int count=0;
		while(n>0) {
			
			a=n%10;
			count++;
			
			n=n/10;
		}
		System.out.println(count);
	}

}
