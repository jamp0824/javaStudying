public class BreakTest09 {
	public static void main(String[] args) {
		
		while(true) {
			int num01=(int)(Math.random()*6)+1;
			int num02=(int)(Math.random()*6)+1;
			System.out.println("("+num01+","+num02+")");
		
		if((num01+num02)==5) {
			break; //두 주사위 번호 합니 5일때 무한 루프문 종료
			}
		}//while
	}

}
