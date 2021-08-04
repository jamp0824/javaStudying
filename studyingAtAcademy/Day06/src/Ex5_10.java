import java.util.Scanner;

public class Ex5_10 {
	static void name() { //void형은 리턴타입이 없다.(반환값이 없다.)
	System.out.println("자기 이름: 홍길동");
	}
	static void guDan(int k) {
		int result=0;
		for(int j=1;j<=9;j++) {
			result=k*j;
			System.out.println(k+"x"+j+"="+result);
		} //for
	}	//guDan
	public static void main(String[] args) {
		name();	// 이름이 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단(2~9사이만 입력)>> ");
		int k=sc.nextInt();
		if(2<=k && k<=9) {
			System.out.println("======"+k+"단=======");
			guDan(k);
			/*문제) 입력한 해당 숫자의 구구단을 출력하는 프로그램을 완성하세요.
			 */
		}else {
			System.out.println("2~9사이 정수값만 일력하세요!");
		}//if else
	}//main
	

}
