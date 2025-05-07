package Strings;

public class Reverseeachword {
	
public static void main(String[] args) {
	String str="Welcome to Java";
	
	String[] words=str.split(" ");
	
	String reversestring="";
	
	for(String s : words) {
		String reverseword="";
		
		for(int i=0;i<s.length();i++) {
			
			reverseword=s.charAt(i)+reverseword;
		}
		
		reversestring =reversestring + reverseword+" ";
	}
	
	System.out.println(reversestring);
	}
			
}
