public class TryCatch03 {
	public static void main(String[] args) {
		int a=9,b01=3,b02=0,re=0;
		
		try {
			re=a/b01;
			System.out.println("9 / 3 = "+re);
			
			re=a/b02; //예외가 발생
			System.out.println(re); //이문장은 실행 안함.
		}catch(Exception e) {
			e.printStackTrace();//예외 발자취를 남김
		}finally {
			System.out.println("예외와 상관없이 무조건 마지막에 실행될 때 사용");
		}
	}

}
