package class_1;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person();
		kim.name = "김또깡";
		kim.birthDay = "19930203";
		kim.gender = "남자";
		
		kim.greeting();
		
		Person yu = new Person();
		yu.name = "유재석";
		yu.birthDay = "19880403";
		yu.gender = "남자";
		
		System.out.println(kim.compareAge(yu));
		System.out.println();
		
		//
		
		GradeCard myCard = new GradeCard();
		int[] scores = {80, 94, 76};
		myCard.scores = scores;
		myCard.name = "강동원";
		
		myCard.printScores();
		System.out.println();
		System.out.println(myCard.name + "님의 평균은 " + myCard.calculateAverage());
		
	}

}
