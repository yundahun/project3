package Quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 7이 홀수가 맞는지 확인하고, 결과를 출력하세요
		int x = 7;
		boolean result1 = (x % 2 == 1);
		System.out.println(result1);
		
		// 선생님 답
		int value1 = 7 % 2; //나머지 구하기
		boolean result3 = (value1 == 1); // 나머지가 1인지
		System.out.println(result3);
		
		// 10이 짝수가 맞는지 확인하고, 결과를 출력하세요
		int y = 10;
		boolean result2 = (y % 2 == 0);
		System.out.println(result2);
		
		// 선생님 답
		int value2 = 10 % 2; //나머지 구하기
		boolean result4 = (value2 == 0); // 나머지가 0인지
		System.out.println(result4);

	}

}
