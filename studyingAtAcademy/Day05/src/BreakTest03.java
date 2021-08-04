public class BreakTest03 {
	public static void main(String[] args) {
/* 1. 반복문 내에서 continue문을 만나면 아래문장을 실행하지 않고 다음 반복을 계속한다.
 */
			for(int i=1;i<=10;i++) {
				if(i%4==0) {//4의 배수일때 실행
					continue;
				}
				System.out.print(i+ " ");
			}//for 
			System.out.println("\n===============>");
/*	1. 무한루프문이란 반복문 무조건 참이어서 영원한 반복하는 반복문을 말한다.
 * 	2. 무한루프문 종류)
 *  	가.while(true){}
 *  	나.for(::){}
 */
			int n=1;
			while(true) {
				System.out.print(n+"end ");
				if(++n>= 10) {
					break;	//무한루프문 종료
				}
			}//while
			System.out.println("\n===================>");
			
			n=1;
			for(;;) {
				System.out.print(n+"end ");
				if(++n>=10) {
					break; //무한루프문 종료
				}
			}
	}
}
