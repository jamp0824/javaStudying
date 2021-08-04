public class ArrayTest17 {
	public static void main(String[] args) {

		int[] scores = {80,100,90};
		
		for(int i =0;i<scores.length;i++) {
			System.out.println("score["+i+"] : "+scores[i]);
		}
		
		int sum=0; //배열 원소 누적합
		for(int a:scores) {
			sum+=a;
		}
		 
		double avg=(double)sum/scores.length; //평균
		System.out.println("총합 = "+sum);
		System.out.println("평균 = "+avg);
	}

}
