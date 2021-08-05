public class TryCatch05 {
	public static void main(String[] args) {
		int[] num= {10,20,30};
		
		try {
			System.out.println("Test -1");
			num[4]=50; //배열 주소 범위를 벗어나 ArrayIndexOutOfBoundsException 예외 오류를 발생
			System.out.println("Test -2");
		}catch(Exception e) {
			System.out.println("예외발생: "+e);
		}
	}

}
