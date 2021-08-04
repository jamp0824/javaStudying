public class ArrayMethod06 {
	public static void main(String[] args) {
		int score[][]= {
				{100,100},
				{90,90}
					};	//2행* 2차원 배열원소값 초기화
	int sum=0; //배열원소 누적합
	for(int i=0;i<score.length;i++) { //score.length 는 행의 길이 2	
		for(int j=0;j<score[i].length;j++) {	//score[i].length는 각 행의 열의 길이2
			System.out.println("score["+i+"]["+j+"] : "+score[i][j]);
			} //inner for
	}//outer for
	System.out.println("\n================>");
	
	//향상된 확장for
	for(int[] arr:score) {
		for(int k:arr) {
			System.out.print(k+" ");
			sum+=k;
		}
		}
	System.out.println("\n\t합계="+sum);
	}

}
