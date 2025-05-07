package Strings;

public class reversestrng {

	
	public static void main(String[] args) {
		
		String s="MURALI krishna";
		
		int l=s.length();
		char ch;
		String str="";
		for(int i=0;i<l;i++	) {
			 ch=s.charAt(i);
			 str=ch+str;
			
		}
	    System.out.println(str);
		
	}
}
