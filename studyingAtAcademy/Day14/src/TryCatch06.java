public class TryCatch06 {
	static void p(int a ) throws NullPointerException,Exception{
		/*	throws 키워드를 사용한 예외처리)
		 * 		형식) 접근제어자 반환타입 메서드명(매개변수) throws 예외클래스,예외클래스{
		 * 		실행문장;
		 * 		} throws를 상ㅇ한 예외처리는 해당 메서드를 호출한 곳으로 예외를 떠넘기면서 예외를 처리한다.	
		 */
		if(a==0) {
			throw new NullPointerException(); //throw예약어는 생성자를 호출하면서 인위적 예외를 발생한다
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			System.out.println("예외 발생 전");
			p(0); //예외발생
			System.out.println("예외 발생 후");
		}catch(NullPointerException e) {
			e.printStackTrace(); //예외 족적을 자세히 보여준다. => 개발자 테스트 단계에서 에러를 잡을때 사용
		}catch(Exception e ) {e.printStackTrace();}
	}

}
