import java.util.function.IntBinaryOperator;

public class FunctionTest15 {
	static int[] scores= {10,50,3};

	static int maxOrMin(IntBinaryOperator operator) {
		int result=scores[0]; //첫번째 배열원소값 저장
		for(int score:scores) {
			result=operator.applyAsInt(result, score);
		}
		return result;
	}
	public static void main(String[] args) {
		//최대값 얻기
		int max=maxOrMin(
				//문제) 최대값을 구하는 람다식을 완성하자
				(a,b)->{
					if(a>b) {
						return a;
					}//if
					else {
						return b;
					}
				}
				);
		System.out.println("최대값 = "+max);
		int min=maxOrMin(
				(a,b)->(a<=b?a:b));
		System.out.println("최소값= "+min);
	}

}
