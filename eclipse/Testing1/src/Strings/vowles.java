package Strings;

public class vowles {

	
	public static void main(String[] args) {
		String ss="Good Morning Engineers";
		char[] vow= {'a','e','i','o','u','A','E','I','O','U'};
	
		char[] ch=ss.toCharArray();
		
		for(char  cht :ch) {
			
			for(char vv :vow ) {
				
				if(cht==vv) {
					
					System.out.print(cht + " ");
					
				}
			}
		}
	}
}
