package DemoGITTest;

public class Replace_SpecialandSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String X = "Publicis Sapient | Digital Business Transformation & Consulting";
		
		System.out.println(X.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
