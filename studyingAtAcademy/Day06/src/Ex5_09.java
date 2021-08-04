import java.util.Scanner;

public class Ex5_09 {
	public static void main(String[] args) {
		
		boolean run=true;
		int studentNum=0;
		int[] scores = null;
		Scanner sc =new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------->");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------->");
			System.out.print("선택>>");
			
			int selectNo=sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수>> ");
				studentNum= sc.nextInt();
				scores= new int[studentNum]; //학생수 크기의 배열생성
					
			}else if(selectNo ==2 ) {
				for(int i=0;i<scores.length;i++) {
					System.out.print("점수 ["+(i+1)+"]>>");
					scores[i]=sc.nextInt(); //점수를 입력받아 배열원소값으로 저장
				}
			}else if(selectNo ==3 ) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("score["+i+"] : "+scores[i]);
				}
			}else if (selectNo ==4 ) {
				int max = 0; //최고점수
				int sum = 0; //총합
				double avg = 0.0; //평균
				for(int i=0; i<scores.length;i++) {
					sum+=scores[i];
					max=(max<scores[i])?scores[i]:max;	//삼항 조건연산자
				} //for
				avg=(double)sum/studentNum; //총합/학생수
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			} else if(selectNo == 5) {
				run=false;	//반복문 종료
			}
		}//무한루프 반복문
		System.out.println("프로그램을 종료합니다");
	}

}
