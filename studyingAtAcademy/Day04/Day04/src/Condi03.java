public class Condi03 {
	public static void main(String[] args) {
		
		int time=(int)(Math.random()*4)+8;
/* Math.random()은 0.0이상 1.0미만->*4를 하면 0.0이상 4.0미만->(int)캐스팅하면 0이상 4미만->+8을 하면 
 * ->결국 8이상 12미만 즉 11사이 정수 숫자 난수를 발생*
 */
		System.out.print("{현재 시간:"+time+" 시]");
		switch(time) {
		case 8 : System.out.println("출근합니다.");
		case 9 : System.out.println("회의를 합니다.");
		case 10 : System.out.println("업무를 봅니다.");
		default : System.out.println("외근을 나갑니다.");
		}
		
	}

}
