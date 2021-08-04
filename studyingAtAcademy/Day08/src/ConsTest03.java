class Computer{
	
	int sum1(int[] arr) {
		int sum=0;//누적합
		for(int k:arr) {
			sum+=k;
		}
		return sum;
	}//sum1()
	
	int sum2(int...arr) {
/*	int ... arr 가변인자 문법은 자바 5버전에서 추가된 것으로 매개변수 개수가 다른 메서드인 경우
 * 	사용한다. 인자값을 배열로 받아서 처리한다.	
 */
		int sum=0;//지역변수는 반드시 초기화를 하고 사용해야 한다.
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i]; //배열원소 누적합
		}
		return sum;
		
	}
}
public class ConsTest03 {

	public static void main(String[] args) {

		Computer c =new Computer();
		int[]score= {1,2,3};
		int result=c.sum1(score); //누적합
		System.out.println("score배열원소 누적합= "+result);
		System.out.println("배열원소 누적합= "+c.sum1(new int[] {10,20,30}));
		
		result=c.sum2(10,20);
		System.out.println("10+20="+result);
		System.out.println("1+2+3="+c.sum2(1,2,3));
	}

}
