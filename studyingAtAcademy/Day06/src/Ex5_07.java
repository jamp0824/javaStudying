public class Ex5_07 {
	public static void main(String[] args) {
		
		int max=0; //최대값을 저장할 변수
		int[] array= {1,5,3,8,2};
/* 문제) Array배열에서 최대값을 구하는 알고리즘 코드를 완성시켜라
 * 
 */
		max=array[0];//첫번째 배열원소값을 저장
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			} //if
		}//if
		System.out.println("array 배열 원소에서 최대값은 : "+max);
	}

}
