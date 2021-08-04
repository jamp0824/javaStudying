public class ArrayMethod01 {
	static void sum(int a) {
	/*	1.static 예약어로 정의된 sum()을 정적메서드라고 한다. 정저메서드(클래스 메서드)는 해당 클래스명으로 직접
 * 접근할 수 있다. ArrayMethod01.sum(7);으로 접근가능하다. 하지만 같은 클래스명 내에서는 클래스명. 은 생략가능하다.
 *	2.void형은 리턴값 즉 반환타입이 없는 자료형이다. 리턴타입이 없다. 이런경우는 해당 메서드 {}블록내에서 실행된 문장 최종 결과값을
 *	해당 메서드명을 호출한 곳으로 반환할 필요가 없다.
 *  3.int a를 매개변수 즉 전달인자라고 한다. 매개변수에 저장되는 값은 인자 또는 인수값이라고 한다. 다른말로
 *  parameter value라고 한다.
 */
		int i; //반복문 제어변수
		int sum=0; //누적합
		for(i=1;i<=a;i++) {
			sum+=i;
		}
		System.out.println("1~"+a+"까지 누적합 ="+sum);
	}
	static int abs(int data) {
		if(data <0) {
			data=-data;
			}
		return data; // return으로 abs()메서드 호출한 곳으로 최종 결과값을 반환
	}
public static void main(String[] args) {
	sum(5); //매서드 호출
	sum(10); 
	int result= abs(-10); 
	System.out.println("-10의 절대값 = "+result);
}

}
