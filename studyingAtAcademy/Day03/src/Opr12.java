import java.util.Scanner;

public class Opr12 {
	public static void main(String[] args) {
/* 문제) 스캐너를 사용하여 0~100사이 정수값만 입력되게 하고, 아니면 유효성 검증 처리한다. 입력하신 정수를 기반으로
 * if else if 다중 조건문을 활용하여 A+,A-,A0,B+,B-,B0...,D+,D-,D0,F학점을 각각 구하는 코드를
 * 작성해 보시길 바랍니다.
 */
		Scanner sc = new Scanner(System.in);
		int score=0; //점수
		char grade = ' '; //학점
		char opt = '0';
		
		
		System.out.print("0~100사이 정수값을 입력하세요 : ");
		score = Integer.parseInt(sc.nextLine());
		if(score>=0&&score<=100) {
			if(score>=90) {
				grade='A'; 
				if(score>=98) {
					opt='+';
				}else if(score>=94){
					opt='-';
				}
			}else if(score>=80) {
				grade='B'; 
				if(score>=88) {
					opt='+';
				}else if(score>=84){
					opt='-';
				}
			}
			else if(score>=70) {
				grade='C'; 
				if(score>=78) {
					opt='+';
				}else if(score>=74){
					opt='-';
				}
			}
			else if(score>=60) {
				grade='D'; 
				if(score>=68) {
					opt='+';
				}else if(score>=64){
					opt='-';
				}
			}else {
					grade='F';
				} 
			if(grade !='F') {
				System.out.println(score+"점수는 "+grade+opt+" 입니다.");
			}else {
				System.out.println(score +"점수는 "+grade+" 학점입니다.");
			}
		}else {
			System.out.println("범위를 벗어났습니다.");
			}
		}
	}

