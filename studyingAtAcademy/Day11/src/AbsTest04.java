abstract class Abs05{//추상클래스도 명시적인 상속을 받지 않으면 extends Object이다.
	abstract void m01();
	
	void m02() {
		System.out.println();
	}
}//Abs05 class

abstract class Abs06 extends Abs05{
	void m03() {
		System.out.println("일반 메서드 m03()");
	}
	
}//Abs06 class

class SubClass06 extends Abs06{

	@Override
	void m01() {
		System.out.println("오버라이딩 된m01()");
	}
	
}
public class AbsTest04 {
	public static void main(String[] args) {
		SubClass06 sub = new SubClass06();
		sub.m01();
		sub.m02();	sub.m03(); //각각 상속받아서 호출
	}

}
