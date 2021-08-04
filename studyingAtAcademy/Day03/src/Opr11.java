import java.util.Scanner;

public class Opr11 {
	public static void main(String[] args) {

/* if(조건문 1){ 
 * 조건식 1이 참이면 실행;
 * }else if(조건식 2){
 * 조건식 2가 참이면 실행{
 * }else if(조건식 3){
 * 조건식 3이 참이면 실행;
 * }else{
 * 조건식 1,2,3 모두 거짓일때 실행;
 * }
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수숫자 입력>>");
		int num = Integer.parseInt(sc.nextLine()); //nextLine()메서드로 문자열로 읽어들임. 읽어들인 문자열을
		//parseInt()메서드로 정수 숫자로 변경.
		
		System.out.print(num+"은(는) ");
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다");
		}else {
			System.out.println("0입니다.");
		}
		System.out.println("=================>");
		
		char grade = ' '; //학점
		System.out.println("0~100사이 점수 입력>> ");
		int score = sc.nextInt(); //nextInt()메서드로 정수 숫자로 바꿈
		
		if(!(0<=score && score <= 100)) {
			System.out.print("0~100사이 점수만 입력하세요!");
		}else {
			if(score>=90) {
				grade='A';
			}else if(score >=80) {
				grade='B';
			}else if(score>=70) {
				grade='C';
			}else if(score>=60) {
				grade='D';
			}else {
				grade='F';
			}//if else if
			System.out.println(score+"점수는 "+grade+"학점입니다.");
		}
	}
}
