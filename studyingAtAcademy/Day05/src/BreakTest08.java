public class BreakTest08 {
	public static void main(String[] args) {
		
		outer:for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+" - >"+lower);
				if(lower=='g') {
					break outer; //이중 for중단
				}
			} 
		} //outer for
		System.out.println("프로그램 종료");
/*	문제)for 문과 continue 문을 활요해서 1부터 10사이 짝수만 출력하는 코드를 완성하시오
 */
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.print(i+" ");
		} System.out.println();
/*	 문제)for 반복문을 이용해서 1부터 100까지 자연수 중에서 4의 배수 합을 구하는 코드를 작성하세요
 * 	
 */
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%4==0) {
				sum+=i;
			}
		}System.out.println(sum);
	}

}
