package DemoGITTest;

public class Chanage_occorance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s =  "Rahul Sahay"; 
		int n = s.length();
		
		for(int i = 0; i<=n; i++) {
			char ch []  = s.toCharArray();
			String newstr  = " ";
			if(newstr.indexOf(ch(i)) == -1) 
				
				newstr = newstr + ch;
			else
				newstr = newstr +"$";
			
		}
		
	}

}
