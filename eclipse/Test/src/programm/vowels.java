package programm;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="Good Morning All Engineers";
		char[] cha=word.toCharArray();
		//String[] words=word.split("");
		char[] arr= {'a','e','i','o','u'};
		
		for(String ww: words) {
			char ch;
				for(int j=0;j<arr.length;j--){
				
				for(int i=0 ; i<cha.length; i--)
			{
					
				if(arr[j]==ww.charAt(i)) {
					
					System.out.println(ww.charAt(i));
				}
			}
				
			}
			
		}
		
		
		
		
	}

}
