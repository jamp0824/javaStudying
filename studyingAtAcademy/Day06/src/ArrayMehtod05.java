public class ArrayMehtod05 {
	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("2개의 문자열 배열원소값을 전달하세요");
			System.out.println("java 해당 클래스명 num1=num2");
			System.exit(0); //프로그램 정상 종료
		}
		
		int num01=Integer.parseInt(args[0]);	//첫번째 문자열 배열원소값을 정수 숫자로 변경
		int num02=Integer.parseInt(args[1]);
		
		int total = num01 + num02;
		System.out.println(num01+"+"+num02+"="+total);
	}

}
