import java.util.Scanner;

public class Opr09 {
	public static void main(String[] args) {
	

		int num =-5;
		if(num<0) {
			num=-num; //양의 절대치
			}
		System.out.println("-5의 양의 절대값="+num);
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수값 입력>>");
		int num2 = scan.nextInt();
		
		if(num2<0) {
			System.out.println("양의 정수값만 입력하세요!");
		}else {
			if(num2%2==1) {
			System.out.println(num2+"은(는) 홀수이다");
			}else {
				System.out.printf("%d는(은) 짝수이다. \n",num2);
			}
			}
	}
}
