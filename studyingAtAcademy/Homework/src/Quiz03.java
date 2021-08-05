import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	System.out.println("키와 나이를 입력하세요.");
	System.out.print("키:");
	Scanner sc =new Scanner(System.in);
	int height=sc.nextInt();
	System.out.print("나이:");
	int age= sc.nextInt();
	System.out.println("=================");
	if(height>=140&&age>=8) {
		System.out.println("놀이기구 탑승이 가능합니다");
		
	}else {
		System.out.println("놀이기구 탑승이 불가능합니다");
	}
}
}
