public class ArrayTest12 {
	public static void main(String[] args) {
		
		int[] score= {100,90,80};//배열원소값을 직접 저장하면서 score 배열생성
		int sum=0; //배열 원소 누적합
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] : "+score[i]);
		}
		for(int k:score) {
			sum+=k; //누적합
		}
		System.out.println("배열 원소 누적합="+sum);
	}

}
