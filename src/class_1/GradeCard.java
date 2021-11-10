package class_1;

public class GradeCard {
	String name;
	int[] scores;
	
	void printScores() {
		System.out.print("성적 : ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
	}
	
	double calculateAverage() {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		return sum / (double)scores.length;
	}
}
