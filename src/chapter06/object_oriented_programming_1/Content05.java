package chapter06.object_oriented_programming_1;

class Time {
	int hour;
	int minute;
	float second;
	
	// 유효한 값이 아니면 메서드를 종료(return)한다
	public void setHour(int h) {
		if (h < 0 || h > 23) {
			return;
		}
		hour = h;
	}
}

public class Content05 {

	int hour1, hour2, hour3;
	int minute1, minute2, minute3;
	float second1, second2, second3;  
	
	int[] hour = new int[3];
	int[] minute = new int[3];
	float[] second = new float[3]; // 하나의 시간을 구성하는 시,분,초 가 서로 분리되어 있다

	
	Time t1 = new Time();
	Time t2 = new Time();
	Time t3 = new Time(); // 하나의 시간을 구성하는 시,분,초 가 묶여있음
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

