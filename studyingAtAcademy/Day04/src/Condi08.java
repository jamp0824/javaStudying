public class Condi08 {
	public static void main(String[] args) {
		
		int dan;
		int j;
		
		for(dan=2;dan<=9;dan++) {
			System.out.println("**"+dan+"단**");
			for(j=1;j<=9;j++) {
				System.out.println(dan+"x"+j+"="+(dan*j));
			}//inner for
			System.out.println("\n=========>");
		}//outer for
		//별표 ***** 5개씩 각행의 출력
		for(int i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
			System.out.print("* ");
			}
			System.out.println(); //줄바꿈
		}
		System.out.println("\n==============>");
	}
}
