package SwitchCaseWork;

public class Check_EvenOdd {

	public void evenodd() {
		int n = 2;
		String result = " ";
		result = switch (n) {
		case 1 ->  "odd";
			
		
		case 2 -> "even";
		
		
		default -> "yes";
		
		};
		
		System.out.println(result);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check_EvenOdd check = new Check_EvenOdd();
		check.evenodd();
		
	}

}
