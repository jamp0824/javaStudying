import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		String result=(num%2==0)?"짝수":"홀수";
		System.out.println("입력받은 수는 : "+result);
		
	}

}
