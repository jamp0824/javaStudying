import java.util.function.IntBinaryOperator;

class Calculator{
	static int staticMethod(int x, int y) {
		return x+y;
	}//정적메서드
	int instanceMethod(int x, int y) {
		return x+y;
	}//인스턴스 메서드
}
public class FunctionTest11 {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x,y)-> Calculator.staticMethod(x, y);
		System.out.println("결과1: "+operator.applyAsInt(1, 2));
		
		//정적메서드 참조=> 클래스명 :: 정적메서드
		operator = Calculator :: staticMethod;
		System.out.println("결과: "+operator.applyAsInt(3, 4));
		
		Calculator obj = new Calculator();
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: "+operator.applyAsInt(5, 5));
		
		//인스턴스메서드 참조 => 객체명 :: 인스턴스메서드명;
		operator = obj :: instanceMethod;
		System.out.println("결과4: "+operator.applyAsInt(10, 10));
	}
}
