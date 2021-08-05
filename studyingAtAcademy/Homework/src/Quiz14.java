import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}if(count==2) {
			System.out.println(num+"는 소수입니다.");
		}else {
			System.out.println(num+"는 소수가 아닙니다.");
		}
		
	}

}
