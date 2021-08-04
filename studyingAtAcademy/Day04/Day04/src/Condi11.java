public class Condi11 {
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					System.out.println(""+i+j+k); //덧셈하지 않고 문자열로 연결해서 출력합니다.
				}
			}
		}
/*	문제1.) 22부터 76까지 짝수의 개수와 그 합을 구하는 프로그램을 작성하시오
 * 			짝수의 개수->28
 * 			그 합 -> 1372
 */
		int count=0;
		int sum=0;
		for(int i=22;i<=76;i+=2) {
			sum+=i;
			count++;
			
			
		}System.out.println("짝수의 개수->"+count);
		System.out.println("그 합 ->"+sum);
		System.out.println();
/*	문제2.) 1부터 100사이의 합을 구하되 10단위마다 한번씩 출력하시오.
* 			1~10까지의 합 -> 55
* 			...
* 			1~100까지의 합 -> 5500
*/
		for(int i=10;i<=100;i+=10) {
			int sum1=0;
			for(int j=1;j<=i;j++) {
				sum1+=j;
			}
			System.out.println("1~"+i+"까지의 합 ->"+sum1);
		}System.out.println("===========================>");
/* 문제3.) 1 부터 100까지의 짝수를 출력하되 한줄에 20까지 출력하시오 
 */
		for(int i=1;i<=100;i+=20) {
			for(int j=1;j<=19;j+=2) {
				System.out.print(i+j+"\t");
			}System.out.println();
		}System.out.println("===========================>");
/* 문제5.) 
 *	*****
 * 	****
 * 	***
 * 	**
 * 	*
 */
		for(int i=1;i<=5;i++) {
			for(int j=5;i<=j;j--) {
				System.out.print('*');
			}System.out.println();
		}
	}

}
