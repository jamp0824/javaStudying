public class Try10 {
	public static void main(String[] args) {
		String[] strArray = {"100","2a"};
		int value = 0;
		for(int i=0; i<=2;i++) {
			try {
				value=Integer.parseInt(strArray[i]); //parseInt()에 의해서 정수 숫자로 바꿈=>
				//"2a"를 정수 숫자로 바꾸면 a 는 숫자로 변경못해서 NumberFormatException 예외오류 발생
			}catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("배열 주소 범위를 벗어남.");
			}catch(NumberFormatException ne) {
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
	}

}
