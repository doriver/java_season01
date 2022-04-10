package class_1;

public class Ex01 {
	public static void main(String[] args) {
		
		
		// ScoreData클래스 타입의 참조변수
		ScoreData scoreData; // (클래스의 객체를 참조하기 위한)참조변수를 선언
		scoreData = new ScoreData(); // 클래스의 객체를 생성후, 객체의 주소를 참조변수에 저장

//		참조변수의 타입               객체의 타입
//		ScoreData scoreData = new ScoreData();
		
		scoreData.name = "국어";
		scoreData.score = 80;
		scoreData.ranking = 10;
		
		System.out.println(scoreData.name);
		System.out.println(scoreData.score);
		System.out.println(scoreData.ranking);
		
		System.out.println();
		
		//
		
		Student firstStudent = new Student();
		firstStudent.name = "장동건";
		firstStudent.className = "java";
		firstStudent.age = 23;
		firstStudent.phoneNumber = "0102913123";
		
		Student secondStudent = new Student();
		secondStudent.name = "고소영";
		secondStudent.className = "java";
		secondStudent.age = 17;
		secondStudent.phoneNumber = "0102938844";
		
		Student[] students = new Student[2];
		students[0] = firstStudent;
		students[1] = secondStudent;
		
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println(student.name);
			System.out.println(student.age);
			System.out.println(student.className);
			System.out.println(student.phoneNumber);
			
			System.out.println();
		}
		
		
	}
	
}
