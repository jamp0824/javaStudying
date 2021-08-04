public class Homework {
	public static void main(String[] args) {
		/* 과제물 1) 이중 for 반복문을 사용하여 다음과 같이 출력되게 하시오.
		 * 출력예) 	*
		 * 		  	**
		 * 		  	***
		 * 		  	****
		 * 	  	  	*****
		 */
				//코드 작업
				for(int i =1;i<=5;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}System.out.println();
				}
				System.out.println("\n============>");

		/* 과제물 2) 이중 for 반복문을 사용하여 다음과 같이 구구단을 출력하게 하고, while 반복문을 사용하여 구구단 제목을 출력되게 하시오.
		 * 출력예) 출력예) 2단		3단 ... 	8단 ... 	9단
		 * 				2*1=2   3*1=3 	8*1=8	9*1=9
		 * 				2*2=4	3*2=6	8*2=16	9*2=18
		 */		int i=2;
		 		while(i<=9) {
		 			System.out.print(i+"단\t");
		 			i++;
		 		}System.out.println();
				for(i=1; i<=9; i++) { 
					
					for(int j=2; j<=9; j++) {
						
						System.out.print(j+"*"+i+"="+(i*j)+"\t");
					}System.out.println();
				}
				System.out.println("====================>");
				/*	문제1.) 22부터 76까지 짝수의 개수와 그 합을 구하는 프로그램을 작성하시오
				 * 			짝수의 개수->28
				 * 			그 합 -> 1372
				 */
						int count=0;
						int sum=0;
						for( i=22;i<=76;i+=2) {
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
						for(i=10;i<=100;i+=10) {
							int sum1=0;
							for(int j=1;j<=i;j++) {
								sum1+=j;
							}
							System.out.println("1~"+i+"까지의 합 ->"+sum1);
						}System.out.println("===========================>");
						
						int sum02=0;
						for(i =1;i<=100;i++) {
							sum02+=i;
							if(i%10==0) {
								System.out.println("1~"+i+"까지의 합=>"+sum02);
							}
						}System.out.println("==========================>");
				/* 문제3.) 1 부터 100까지의 짝수를 출력하되 한줄에 20까지 출력하시오 
				 */
						for(i=1;i<=100;i+=20) {
							for(int j=1;j<=19;j+=2) {
								System.out.print(i+j+"\t");
							}System.out.println();
						}System.out.println("===========================>");
						
						int sum03=0;
						for(i=1;i<=100;i++) {
							if(i%2==0) {
								System.out.print(i+"\t");
								if(i%20==0) {
									System.out.println();
								}
							}
								
						} 
				/* 문제5.) 
				 *	*****
				 * 	****
				 * 	***
				 * 	**
				 * 	*
				 */
						for(i=1;i<=5;i++) {
							for(int j=5;i<=j;j--) {
								System.out.print('*');
							}System.out.println();
						}
	}
}
