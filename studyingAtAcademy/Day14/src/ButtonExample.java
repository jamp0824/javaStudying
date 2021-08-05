class Button{
	OnClickListener listener; //멤버변수

	void setOnClickListener(OnClickListener listener) {//다형성
		this.listener=listener; //멤버변수 초기화
	}

	void touch() {
		listener.onClick();//업캐스팅 후 오버라이딩 된 메서드 호출
	}
	interface OnClickListener{
		void onClick(); //추상메서드
	}//중첩인터페이스->Button$OnClickListener.class
}
class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}//첫번째 자손 클래스
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
	
}//두번째 자손 클래스
public class ButtonExample {
	public static void main(String[] args) {
		Button bt =new Button();
		bt.setOnClickListener(new CallListener());//첫번째 자손 이벤트 등록합니다.
		bt.touch();
		bt.setOnClickListener(new MessageListener()); //두번째 자손 이벤트 등록합니다.
		bt.touch();
	}

}
