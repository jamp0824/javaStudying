public class ArrayMethod04 {
	static void getSum(int[] arr) {
		int sum=0;
		double avg=0;
		for(int a: arr) {
		sum+=a;
	}	
		System.out.println("총합:"+sum);
		avg=(double)sum/arr.length;
		System.out.println("평균:"+avg);
		
	}
	
	
	public static void main(String[] args) {
		int[] score = {100,90,90};
		getSum(score);
/* 문제) 정적메서드 static void getSum(int[] arr){}을 선언하고 해당 메서드를 호출했을 때 int타입 총점과 
 * double 타입 평균을 구해서 출력하는 코드를 작성하세요.
 */
	}

}
