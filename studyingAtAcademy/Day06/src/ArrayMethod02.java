public class ArrayMethod02 {
	public static int add(int[] score) {
		int sum =0; //sum을 지역변수라 한다. 지역변수는 해당 add()메서드 {}중괄호 블록 영역내에서만 사용할 수 있다.
		//지역변수는 반드시 초기화를 하고 사용해야 한다.
		//초기화를 하지 않고 사용하면 컴파일 에러가 발생한다.
		for(int i=0;i<score.length;i++) {
			sum = sum+score[i]; //배열원소 누적합
		}
		return sum;
	}
	public static void main(String[] args) {
		int scores[]; //scores배열선언  //int [] scores; 도 가능
		scores = new int[] {80,100,80};
		
		int sum=0;
		for(int i =0; i<scores.length;i++) {
			sum+=scores[i];
		}//for
		System.out.println("scores 배열 원소 누적합= "+sum);
		
		int total = add(new int[] {80,100,80});
		System.out.println("score 배열원소 누적합= "+total);
		System.out.println(add(new int[] {80,100,80}));
	}

}
