import java.util.Scanner;

public class Practice003 {

	public static void main(String[] args) {
		boolean run= true;
		int studentNum =0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while(run){
			System.out.println("----------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------");
			System.out.println("선택>");

			int selectNo = sc.nextInt();

			if(selectNo ==1) {
				studentNum=sc.nextInt();
				scores=new int[studentNum];
			}//selectNo==1
			else if(selectNo ==2) {
				for(int i=0;i<studentNum;i++) {
					System.out.println("점수["+(i+1)+"]");
					scores[i]=sc.nextInt();
				}//for문종료
			}//selectNo==2
			else if(selectNo ==3) {
				for(int i:scores) {
					System.out.println("score["+i+"] : "+scores[i]);
				}
			}//selectNo==3
			else if(selectNo ==4) {
				int max=0;
				for(int i:scores) {
					if(max<scores[i]) {
						max=scores[i];
					}//if
				}System.out.println("최대값은:"+max);
			}//selectNo==4
			else if(selectNo ==5) {
				run =false;
			}//selectNo==5
		}//while문종료
	}

}
