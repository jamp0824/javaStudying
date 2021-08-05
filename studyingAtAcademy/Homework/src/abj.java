import java.util.Scanner;

public class abj {
	public static void main(String[] args) {
		String[] kakao = new String[10];
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("입력할 카카오친구>");
			String name = scan.next();
			if(name.equals("그만")) {
				break;
				}//if
			boolean bool = true; //배열에서 이름의 존재여부를 체크할 변수
			for(int i = 0; i< kakao.length ; i++) {
				if(name.equals(kakao[i])) {
					bool = false; //인력되어 있다면 bool 변수를 false변경
					break;
					}
			}
			if(bool) { //bool 변수가 true라면 입력
				kakao[count] = name;
				count++;
				System.out.println(name + "입력 설공!");
				System.out.println("--------------");
			} else {
				System.out.println("이미 입력된 친구입니다.");
				System.out.println("------------------");
				System.out.println(count + "명의 카카오 친구가 입력 되었습니다.");
				scan.close();
			}
		}

	}
}


