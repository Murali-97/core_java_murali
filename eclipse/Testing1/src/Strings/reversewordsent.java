package Strings;

public class reversewordsent {
 
	public static void main(String[] args) {
		String sentense="samal is good boy";
		
		String[] word=sentense.split(" ");
		String reverword="";
		for(String wor: word) {
		//	char ch;
			String reversentence=" ";
			for(int i=0;i<wor.length();i++) {
				
				reversentence=wor.charAt(i)+reversentence;	
				
			}
			reverword=reverword+reversentence;
		}
		System.out.println(reverword);
		
	}
}
