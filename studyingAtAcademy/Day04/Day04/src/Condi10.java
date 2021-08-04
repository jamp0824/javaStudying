public class Condi10 {
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
		}System.out.println("\n============>");

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
	}
}


