import java.util.Scanner;

public class Quiz006 {
	public static void main(String[] args) {

		System.out.println("구입할 메뉴는?");
		System.out.println("[수박,사과,멜론,포도,귤]");
		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		String fruit= sc.nextLine();
		
		switch (fruit) {
		case "수박":
			System.out.println("수박의 가격은 2만원입니다.");
			break;
		case "사과":
			System.out.println("사과의 가격은 3만원입니다.");
			break;
		case "멜론":
			System.out.println("멜론의 가격은 4만원입니다.");
			break;
		case "포도":
			System.out.println("포도의 가격은 5만원입니다.");
			break;
		case "귤":
			System.out.println("귤의 가격은 6만원입니다.");
			break;	
		default:
			System.out.println(fruit+"은 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요");
			break;
		}
	}

}
