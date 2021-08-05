import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1=0;
		int count2=0;
		
		while(true) {			
			System.out.println("---------------");
			int num1=(int)(Math.random()*100)+1;
			int num2=(int)(Math.random()*100)+1;
			int num3=(int)(Math.random()*2);
			if(num3==1) {
				System.out.println(num1+"+"+num2+"= ?");
				int result=sc.nextInt();
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
				System.out.print(">");
				if(result==0) {break;}
				else if(result==(num1+num2)) {
					System.out.println("정답입니다!!");
					count1++;
				}else if(result !=(num1+num2)){
					System.out.println("틀렸는데요??");
					count2++;
				}
			}//if
			else {

				System.out.println(num1+"-"+num2+"= ?");
				int result=sc.nextInt();
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
				System.out.print(">");
				if(result==0) {break;}
				else if(result==(num1-num2)) {
					System.out.println("정답입니다!!");
					count1++;
				}else if(result !=(num1-num2)){
					System.out.println("틀렸는데요??");
					count2++;
				}

			}//else
		}
			System.out.println("----------------------");
			System.out.println("정답 횟수: " +count1);
			System.out.println("틀린 횟수: " +count2);
		}
		}
