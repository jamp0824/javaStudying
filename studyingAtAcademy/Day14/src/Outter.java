public class Outter {

	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable=1;
		
		//arg=100; //상수는 수정못함
		//localVariable=100;

		class Inner{
			public void method() {
				int result=arg+localVariable; //로컬 클래스에서 사용하는 메서드의 매개변수,지역변수는 final 즉 상수이다.
				//자바 7까지는 final을 생략할 수 없다.
			}
		}//로컬클래스=>Outter$1Inner.class
	}

	//자바 8 이후부터
	public void method02(int arg) {//int arg 매개변수 타입앞에 final이 생략된 상수 매개변수
		//final은 자바 8버젼부터는 생략해도 컴파일러가 묵시적 제공한다.
		int localVariable=1; //int 앞에 final이 생략됨.
		//localVariable=100;
		//arg=100; 로컬(지역) 클래스에서 사용하는 로컬 지역변수와 매개변수는 final상수이다. 
		//localVariable=100;

		class Inner{
			public void method() {
				int result=arg+localVariable;
			}//로컬클래스-> Outter$2Inner.class
		}//로컬클래스 -> Outter$2Inner.class

	}
}
