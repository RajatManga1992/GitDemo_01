package DemoGITTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_Class_1 {

	public static void main(String[] args) {
		String s = "RajatManga";
		System.out.println(printduplicateCharacter(s));
		
	}
	
	public static String printduplicateCharacter(String str) {
		String newStr= "";
		 for (int i=0; i<str.length(); i++) {
			 char ch = str.charAt(i);
			 if(newStr.indexOf(ch)== -1) {
				 
				 newStr = newStr+ch;
			 }
		 }
		 return newStr;
	}
	
	public static void  removeDuplicate_Element_Array(Array a) {
		
		
		
	}
}
