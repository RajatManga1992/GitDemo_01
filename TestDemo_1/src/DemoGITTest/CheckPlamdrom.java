package DemoGITTest;

import java.util.Scanner;

public class CheckPlamdrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = scanner.nextLine();

		if(isPalindrom(input)) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("test fail");
			
		}
		
	}
	public static boolean isPalindrom(String str) {
		
		int left = 0, right = str.length()-1;
		while (left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	
}
