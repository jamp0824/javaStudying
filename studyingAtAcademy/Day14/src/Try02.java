public class Try02 {
	public static void main(String[] args) {
		
		if(args.length == 2) { //length 속성은 배열크기
			String data01=args[0];
			String data02=args[1];
			System.out.println("args[0] : "+data01);
			System.out.println("args[1] : "+data02);
		}else {
			System.out.println("[실행 방법]");
			System.out.println("값1 값2 2개의 배열원소값을 전달해야 한다.");
		}
	}

}
