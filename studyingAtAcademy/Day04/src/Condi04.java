import java.util.Scanner;

public class Condi04 {
	public static void main(String[] args) {
/* for반복문 형식)
 * 	for(초기치;조건식;증감식){
 *  조건식이 참일동안만 반복실행;
 *  }
 * 
 */
		int i; //반복문 제어변수
		for(i=1;i<=5;i++) {
			System.out.print(i+" "); //1 2 3 4 5
		} 
		System.out.println("\n-------------->"); //\n은 줄바꿈(개행)
		
		for(i=3;i>=1;i--) {
			System.out.print(i+ " "); //3 2 1
		}
		System.out.println("\n=================>");
		for(i=2;i<=6;i=i+2) {
			System.out.print(i+" ");
		}System.out.println("\n=================>");
		
		for(i=9;i>=1;i-=2) { //i-=2 2씩 감소
			System.out.print(i+ " "); //9 7 5 3 1
		} System.out.println("\n===========================>");
			Scanner sc = new Scanner(System.in);
			System.out.println("구구단을 출력하기 위한 단 입력>> ");
			int dan= sc.nextInt();
			System.out.println("<---------"+dan+"--------->");
			for(i=1;i<=9;i++) {
				System.out.println(dan+"x"+i+"="+(dan*i));
			}
			
		}
	}


