public class ArrayMethod09 {
	public static void main(String[] args) {
		
		int[] oldIntArray= {1,2,3}; //배열 크기 3
		int[] newIntArray = new int[5]; //배열크기가 5
		
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i]; //첫번째, 두번째, 세번째 배열원소값만 복사됨. =>1 2 3
			//네번째, 다섯번째는 초기값 0
		}
		
		for(int a:newIntArray) {
			System.out.print(a+" ");
		}
		System.out.println("\n======================>");
		String[] oldStrArray= {"java","oracle","jsp"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
/*	arraycopy(원본배열,원본 배열에서 복사할 항목의 시작 인덱스 주소번호, 새배열, 새 배열에서 붙여넣기 함
 *  시작 주소 인덱스번호, 복사할 개수)
 *  결국 첫번째, 두번째, 세번째 배열원소값만 복사된다.나머지는 기본값 null이 저장됨.
 */
		for(String arr:newStrArray) {
			System.out.print(arr+" ");
		}
		System.out.println("\n===========================>");
		int[] scores= {95,71,84,93,87};
		getAvg(scores);
/*	문제) 정적메서드 getAvg(int[] score){}를 정의해서 배열원소 누적합을 구해서 실수 평균값을 구한다음 
 * 	그 값을 반환해서 출력하는 코드를 완성하시오.(실수 평균값 타입은 double):
 */
	}
	static double getAvg(int[]score) {
		double avg=0;
		int sum=0;
		for(int i:score) {
			sum+=i;
		}
		avg=(double)sum/score.length;
		System.out.println("sum값은 "+sum);
		System.out.println("avg값은 "+avg);
		return avg;
		}
	
	

	

}
