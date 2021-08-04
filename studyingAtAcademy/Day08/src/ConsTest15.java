class StaticBlock{
	static int[] arr = new int[10]; 	//배열크기가 10인 정적배열 arr생성

	static {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			/*	0.0이상 1.0미만 난수 발생->*10이면 0.0이상 10미만->int로 캐스팅(형변환)하면 소수점이하
			 *  는 버림. 0이상 10미만 -> +1하면 1이상 11미만 즉 1에서 10사이 임의 정수 숫자 난수가 발생
			 */
		}
	}
}
public class ConsTest15 {

	public static void main(String[] args) {
		/* 문제1)for 반복문을 사용해서 arr배열원소값의 누적합과 실수 평균값을 구하는 코드값을 작성하세요.
		 * 
		 */
		int sum=0;
		double avg=0.0;
		int count=0;
		int [] arr=StaticBlock.arr;
		for(int i: arr) {
			System.out.print(i+" ");
			sum+=i;
			count++;
		}System.out.println("\narr배열원소값의 누적합 "+sum);
		System.out.println("arr배열원소값의 평균값"+(double)sum/count);
		System.out.println("\n=====================>");
		int[] score= {100,90,90};


		int total=add(score);
		/* 문제1) 배열원소 누적합을 구하는 add()를 작성하고 합을 반환받아 출력하세요.
		 * 
		 */
		System.out.println("add()의 누적합 "+total);
		System.out.println("----------------------->");
		/* 문제2) 1부터 10사이 자연수 중에서 3의 배수 총합을 구하는 프로그램을 작성하세요.
		 */
		sum=0;
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}//for
		System.out.println("3의 배수 총합: "+sum);
	}

	static int add(int[] score) {
		int sum=0;
		for(int i:score) {
			sum+=i;

		}return sum;
	}

}
