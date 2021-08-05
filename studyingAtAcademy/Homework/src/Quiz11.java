import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		System.out.println("구구단 단수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("랜덤 구구단"+num+"단");
		System.out.println("----------------");
		for(int i=1;i<=9;i++) {
		System.out.println(num+"x"+i+"="+num*i);
		}
	}

}
