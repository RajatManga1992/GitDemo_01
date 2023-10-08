package DemoGITTest;

import java.util.ArrayList;
import java.util.Arrays;

public class RverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversWords("I love my India");

		// Input - I love my India 
		//Output - India my love I 
		
	}
		static void  reversWords(String inp) {
			
			StringBuffer sb = new StringBuffer();
			int substrend = inp.length();
			int i= substrend-1;
			while(i>=0){
				if(i==0) {
					sb.append(inp.substring(i,substrend));
					break;
				}
				if(inp.charAt(i) == ' ') {
					sb.append(inp.substring(i+1, substrend));
					sb.append(" ");
					substrend = i;
				}
				i--;
			}
			System.out.println(sb.toString());
		}
		
		
	}



