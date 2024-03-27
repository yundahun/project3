package Quiz;

public class Quiz7 {

	public static void main(String[] args) {
		
		boolean result1 = (1 == 2) || (1 < 2); // true
		boolean result2 = true && false; // false
		boolean result3 = !false; // true
		
		int x = 1;
		int y = 5;
		boolean result4 = (x<y) || (x==y); // true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
