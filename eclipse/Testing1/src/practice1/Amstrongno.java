package practice1;

public class Amstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=153, arm=0,a,b=n;
		
		while(n>0) {
		a=n%10;                 // 3
		n=n/10;                 //15
		arm=arm+a*a*a;           //0+27
		
		}
		
		if(arm==b) {
			
			System.out.println("it is a armstrong number " + arm);
		}
		else {
			System.out.println("it is not a armstrong number ");
		
			
		}
		
	}

}
