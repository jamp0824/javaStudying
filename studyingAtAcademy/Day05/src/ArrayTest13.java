public class ArrayTest13 {
	public static void main(String[] args) {

		int[] score = {79,99,91,33,100,55,95};

		int max =score[0]; // 배열의 첫번째 원소값으로 최대값
		int min =score[0]; // 배열의 첫번째 원소값으로 최소값
		/* 문제) 배열원소값에서 최대, 최소값을 구하는 알고리즘 코드를 완성하시오.
		 * 		
		 */
		for(int i=0;i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
		}//for end
		System.out.println("최대값은 : "+max);
		System.out.println("최소값은 : "+min);


	}

}
