public class Ex5_08 {
	public static void main(String[] args) {
		
		int[][] score= {
				{95,96},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0; //배열원소 누적합
		double avg =0.0; //평균
		
/* 문제) 2차원 배열원소값의 총합과 실수 평균값을 구해보는 코드를 완성하세요.(일반 이중for,향상된 확장 for)
 * 
 */		int count =0;	//배열원소값을 카운터
		for(int i=0;i<score.length;i++) {	//score.length는 행의 개수=>3
			for(int j=0; j<score[i].length;j++) {	//score[i].lenth는 각 행의 열의 개수
				sum+=score[i][j];
				count++;	//개수 카운터
			}	//inner for문 
		} avg=(double)sum/count; //outer for문
		System.out.println("총합= "+sum);
		System.out.println("평균= "+avg);
	}

}
