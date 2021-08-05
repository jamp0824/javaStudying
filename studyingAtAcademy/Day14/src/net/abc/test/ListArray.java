package net.abc.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {
	public int getSum(List<Integer>list) {
		int sum=0;
		double avg=0.0;
		for(int i: list) {
			sum+=i;
		}
		
		return sum;
	}
	/*	과제물)1.net.adc.test패키지를 만들고 클래스 파일 ListArray를 생성하자. main()메서드에서 
	 *  int[] arr 배열 원소값으로 100,90,100,80,90을 저장하고 이것을 컬렉션 List<Integer> 타입
	 *  으로 변경한다.
	 *  	 2. ListArray클래스에서 public int getSum(List<Integer> list){}메서드를 정의한다음
	 *  		원소 누적함을 구해서 반환하고 메인메서드에서 double 평균을 구한다음 출력하는 코드를 각 그룹
	 *  		스터디 별 기준으로 작성해 보자. 동시에 누적합도 출력한다.
	 */
	public static void main(String[] args) {
		List<Integer> cityList=new ArrayList<Integer>();
		//java 7부터 뒷부분<> 제네릭 타입을 생략해도 앞 부분 제네릭타입을 보고 유추할 수 있다.
		int[] arr = {100,90,100,80,90};
		for(int i=0;i<arr.length;i++) {
			cityList.add(arr[i]);//컬렉션에 배열원소값을 추가=> 배열 기본타입 int가 컬렉션 레퍼 참
			//조타입 Integer로 오토박싱을 자동형변환이 되어져서 저장됨
			System.out.println();
		}
		ListArray la= new ListArray();
		int sum=la.getSum(cityList);
		System.out.println("누적합: "+sum);
		double avg=(double)sum/cityList.size(); //double/int=> 자동산술법에 의해서 실수/실수
		//=>몫과 나머지를 함께 구함
		System.out.println(avg);
		
		
		
	}

}
