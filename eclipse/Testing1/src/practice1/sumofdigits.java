package practice1;

public class sumofdigits {

	public static void main(String[] args) {
		
	int n=123456,a=0;
		
	while(n>0){
	
		a=a+n%10;
		n=n/10;
	
	}
	System.out.println(a);
	}
     
}
