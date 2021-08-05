interface Calc{
	int sum();
}
class Anonymous3{
	private int field;
	
	void method(final int arg1,int arg2) {
		//int arg2 매개변수 int타입앞에 final이 생략됨
		final int var1=0; //java 8부터는 final이 생략될 수 있습니다.
		int var2=0;
		
		field=10; //Anonymous3 클래스의 인스턴스 변수이기 때문에 10으로 변경가능함.
		
		//arg1,arg2 매개변수, var1,var2메서드는 상수이기 때문에 수정 못함
		
		Calc calc=new Calc() {

			@Override
			public int sum() {
				return field+var1+var2+arg1+arg2;
			}
			
		};//Anonymous3$1.class
		System.out.println("합계="+calc.sum());
	}
}
public class AnonymousExample3 {
	public static void main(String[] args) {
		Anonymous3 anony=new Anonymous3();
		anony.method(0,0);
	}

}
