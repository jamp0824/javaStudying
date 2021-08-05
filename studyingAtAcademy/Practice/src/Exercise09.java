import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run =true;
		int studentNum=0;
		int[]scores=null;
		Scanner sc = new Scanner(System.in);

		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");

			int selectNo=sc.nextInt();

			if(selectNo==1) {
				System.out.print("학생수를 입력하시오 >");	
				studentNum=sc.nextInt();
				scores=new int[studentNum];
			}//if(selectNo==1)
			else if(selectNo==2) {
				System.out.println("점수를 입력하시오 >");
				for(int i=0;i<studentNum;i++) {
					System.out.print("score["+(i+1)+"]=");
					scores[i]=sc.nextInt();
				}//for
			}//else if(selectNo==2)
			else if(selectNo==3) {
				for(int i=0;i<studentNum;i++) {
					System.out.println(scores[i]+" ");
				}//for
			}//else if(selectNo==3)
			else if(selectNo==4) {
				int max=0;
				int min=0;
				int sum=0;
				double avg=0;
				for(int i=0;i<studentNum;i++) {
					sum+=scores[i];
					if(max<scores[i]) {
						max=scores[i];
					}//if
					else if(min>scores[i]){
						min=scores[i];
					}//else if
				}//for
				System.out.println("학생 수"+scores.length+"명 중 가장 높은 점수는"+max+"점이다.");
				System.out.println("학생 수"+scores.length+"명 중 가장 낮은 점수는"+min+"점이다.");
				System.out.println("점수 총합은 "+sum);
				System.out.println("점수 평균은 "+(double)sum/scores.length);
			}//else if(selectNo==4)
			else if(selectNo==5) {
				run=false;
			}else {
				System.out.println("잘못된 입력번호 입니다.");
			}
		}//while
	}

}
