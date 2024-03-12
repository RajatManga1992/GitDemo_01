package DemoGITTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_Class_1 {

	public static void main(String[] args) {
		String s = "RajatManga";
		System.out.println(removeduplicateCharacter(s));
		
	}
	
	public static String removeduplicateCharacter(String str) {
		String newStr= "";
		 for (int i=0; i<str.length(); i++) {
			 char ch = str.charAt(i);
			/*in below loop we are looking for char present in 
			 newStr or not
			 if not index should be -1 */
			 if(newStr.indexOf(ch) == -1) { 
				 
				 newStr = newStr+ch;
			 }
		 }
		 return newStr;
	}
	
	
}
