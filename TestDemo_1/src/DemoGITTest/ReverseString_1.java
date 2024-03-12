package DemoGITTest;

import java.lang.reflect.Array;
import java.util.List;

public class ReverseString_1 {

	public static void main(String[] args) {
		getreversename_new();
		getReverseString();
		//Get_reverse_string("Rajat Manga is bad boy");
	}
	
	
	public static void getreversename_new() {
		System.out.println("\n M1 \n");
//		String str= "Test the product";
	      String arr[]="Rajat Manga is bad boy".split(" ");
	      for(int i=0;i<arr.length;i++)
	      {

	          for(int j=arr[i].length()-1;j>=0;j--)
	          {   
	          System.out.print(arr[i].charAt(j));
	          
	          }
	          System.out.print(" ");
	      }
		
		
		//return reversename;
	}
	public static String getReverseString() {
		System.out.println("\n M2");
		
		// TODO Auto-generated method stub
		  String s[] = "you shall not pass".split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] +" "; 
	      } 
	      System.out.println("\n Reversed String:" + ans);
	      return ans;
	      
	      
	}
	
	public static String Get_reverse_string(String str) {
		 String s[] = str.split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	    	  if(i==0) {
	    		  ans += s[i] +" ";
					//break;
				}
				if(str.charAt(i) == ' ') {
					 ans += " ";
				}
	         
	      } 
	      System.out.println("Reversed String: " + ans);
	      return str;
		
	}
	
}