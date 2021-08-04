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
		int sum1=0;
		for(int i=10;i<=100;i+=10) {
			for(int j=1;j<=i;j++) {
				sum+=j;
				
				
			}
			System.out.println("1~"+i+"까지의 합 ->"+sum);
		}
	}

}
