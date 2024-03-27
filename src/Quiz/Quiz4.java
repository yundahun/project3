package Quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		int mathScore = 90; //수학점수
		int engSccore = 70; // 영어점수
		int korScore = 100; // 국어점수
		
		int totalScore = mathScore + engSccore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);

	}

}
