package Strings;

public class revsen {
public static void main(String[] args) {
    
           String st="samal is good boy";
           String[] words=st.split(" ");
           
           String reversedword = "";
           
           for (int i = words.length - 1; i >= 0; i--) {
        	
       
               reversedword += words[i] + " ";
           }
       System.out.println(reversedword); 	   
}}
         
