public class Condi02 {
	public static void main(String[] args) {
		
		int num =(int)(Math.random()*6+1);
/*	1.Math.random()은 0.0이상 1.0미만 사이의 실수 숫자 난수 (임의의 정해지지 않는 수)를 발생한다.->*6을 하면 
 *  0.0이상 6.0미만 사이 실수 숫자 난수 -> (int)로 형변환 하면 소숫점을 버리고 0이상 6미만->+1을 하면 1이상 7미만
 *  사이의 정수 숫자 난수를 발행- 결국 1부터 6사이의 정수 숫자 난수를 발행 
 */
		System.out.println("주사위 번호에서");
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}System.out.println("=======================");
		/* 자바 1.7부터는 switch case 조건식과 case값에도 문자열이 올 수 있다.
		 */
		String position="과장";
		
		switch(position) {
		case "부장" : System.out.println("월급이 700만원입니다."); break;
		case "과장" : System.out.println("월급이 500만원입니다."); break;
		default : System.out.println("월급이 300만원입니다."); break;
		}
							
						
		}
	}
	

