import java.util.function.IntPredicate;

public class FunctionTest10 {
	public static void main(String[] args) {
		
		//2의 배수 검사
		IntPredicate predicateA = a-> a%2 == 0;
		
		//3의 배수 검사
		IntPredicate predicateB = b-> b%3 ==0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and() => 논리곱
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까"+result);
		
		//or() =>논리합
		predicateAB = predicateA.or(predicateB);
		result=predicateAB.test(9);
		System.out.println("9는 2또는 3의 배수입니까"+result);
	}
}
