import java.util.Scanner;

public class Opr14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 점수 입력>>");
		int score = sc.nextInt();
		score = score/10; //10으로 나눈 몫을 구함.
		
		switch(score) {
		case 10:
		case 9: System.out.println("A학점"); break;
		case 8: System.out.println("B학점"); break;
		case 7: System.out.println("C학점"); break;
		case 6: System.out.println("D학점"); break;
		default: System.out.println("F학점"); break;
			
		}
	}

}
