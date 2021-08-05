public class Try07 {
	public static void main(String[] args) {
		try {
			String data01=args[0]; String data02=args[1];
			int a = Integer.parseInt(data01);
			int b = Integer.parseInt(data02);
			System.out.println(a+"+"+b+"="+(a+b));
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
/*		java 7 부터는 복수개의 catch(){}블록을 |로 연결하면 하나의 catch()문으로 처리할 수 있다.
 * 		
 */
			System.out.println("배열원소값이 없거나 숫자로 변경 못합니다..");
		}finally{
			System.out.println("다시 실행하세요.");
		}

	}

}
