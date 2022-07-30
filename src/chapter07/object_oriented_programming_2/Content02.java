package chapter07.object_oriented_programming_2;

public interface Content02 {

}

interface Fightable extends Movable, Attackable { }

interface Movable {

//	지정된 위치(x,y)로 이동하는 기능의 메서드
	void move(int x, int y);
}

interface Attackable {
	
//	자신 주위의 적들을 공격하는 기능의 메서드
	void attack();
	
}