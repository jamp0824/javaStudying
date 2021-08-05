import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		if(num==0) {
			System.out.println("입력한 정수는"+num+"입니다");
		}else if(num>0) {
			if(num%2==0) {
				System.out.println(num+"은(는) 짝수입니다.");
			}else {
				System.out.println(num+"은(는) 홀수입니다.");
			}//else
		}else {
			System.out.println(num+"은(는) 음의 정수입니다.");
		}
	}

}
