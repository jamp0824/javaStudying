import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int sum=0;
		int num=sc.nextInt();
		for(int i=2;i<=num;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}//if	
			}//for
			if(count==2) {
				sum+=i;
			}
		}//outter for
		System.out.println(num+"까지 소수의 합은:"+sum);
	}

}
