package practice1;

public class palindromeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n=919, a=0,r,b=n;
		
		while(n>0) {
			
			r=n%10;
			System.out.println(r);
			a=a*10+r;
			n=n/10;
			
		}
		if(b==a) {
		System.out.println("it is a palindrom "+ a);
	}else {
		System.out.println("it is not a palindrom");
	}
	}

}
