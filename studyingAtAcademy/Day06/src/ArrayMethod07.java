import java.util.Scanner;

public class ArrayMethod07 {
	public static void main(String[] args) {
		
		String[][]words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"int","정수"}
		}; //3행 * 2행의 2차원 배열 초기화
			
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?",i+1,words[i][0]);
			//%d는 십진수 정수, %s는 문자열
			String answer = sc.nextLine(); //문자열로 읽어들임
			
		if(answer.contentEquals(words[i][1])) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다. 정답은"+words[i][1]+"입니다.");
		}//if else
		}//for
	}

}
