import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		String[] kakao = new String[10];
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("입력할 카카오친구>") ;
			String name = scan.next();
			if(name.equals("그만")) {
				break;
			}
				kakao[count] = name;
				count++;
				System.out.println(name + "입력 성공! ");
				System.out.println();
				System.out.println(count + "명의 카카오 친 구가 입력 되었습니다.");
				scan.close();
			}
		}
}
