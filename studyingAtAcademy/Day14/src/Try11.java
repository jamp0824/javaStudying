class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}
class NotExistIDException extends Exception{
	NotExistIDException(){}
	NotExistIDException(String message){
		super(message);
	}
}
public class Try11 {

	public static void main(String[] args) {
		try {
			login("white","12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			/* 문제) 예외 에러 경고 메시지를 출력하는 문장을 작성하세요. */
		}//첫번째 try~catch문
		try {
			login("blue","54321");
		}catch(Exception w) {
			System.out.println(w.getMessage());
			
		}
	}// 두번째 try catch문
	static void login(String id,String password) throws NotExistIDException, WrongPasswordException{
	/*	문제1) id가 blue가 아니라면 인위적 예외를 발생해서 경고 메시지를 띄우는 코드를 작성하자.
	 * 	문제2) 비번이 12345가 아니라면 인위적 예외를 발생시켜 경고 메시지를 발생해서 메시지를 띄우는 코드를 작성하자
	 */
		if(!id.equals("blue")) {
			throw new NotExistIDException("ID가 존재 하지 않습니다.");
		
	} if(!password.contentEquals("12345")) {
			throw new WrongPasswordException("패스워가 존재하지 않습니다.");
	}

}
}

