import java.util.Scanner;

public class Condi06 {
	public static void main(String[] args) {
/* while(조건식){
 * 조건식이 참일동안만 반복
 * 증감식;
 */
		int i;
		for(i=1;i<=5;i++) {
			System.out.print(i+" "); //1 2 3 4 5
		} 
		System.out.println("\n===========");
		i=1;
		while(i<=3) {
			System.out.print(i+"\t"); //\t는 탭키만큼 숲ㅇ으로 띄움
			i++;
		}
		System.out.println("\n=============>");
		i=3;
		while(i>=1) {
			System.out.print(i+"\t");
			i--;
		}
		System.out.println("\n==========>");
/*
 *  문제) while 반복문 하나 안에 if else 조건문을 활용하여 1부터 10까지 자연수 중에서 홀수 누적합과 짝수 누적합을 각각 구해서
 *  출력하는 코드를 완성한다
 */
		i=1;
		int sum1=0, sum2=0;
		while(i<=10) {
		if(i%2==0) {
			sum1+=i;
			
		}else {
			sum2+=i;
		}
		i++;
		}System.out.println("짝수 누적합은 "+sum1);
		 System.out.println("홀수 누적합은 "+sum2);

	}
}