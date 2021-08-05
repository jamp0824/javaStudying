class Button2{
	interface OnClickListener{
		void onClick(); //추상메서드
	}//중첩인터페이스=>Button2$ClickListener.class
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	void touch() {
		listener.onClick();//오버라이딩 된 메서드를 호출
	}
}//Button2 class
class Window{
Button2 button1 = new Button2();
Button2 button2 = new Button2();

Button2.OnClickListener listener=new Button2.OnClickListener() {
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}
};//익명클래스=>Window$1.class
	Window(){
		button1.setOnClickListener(listener); //첫번째 버튼 이벤트를 넣어줍니다.
		button2.setOnClickListener(new Button2.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});//Window$2.class
	}//기본생성자
}//Main2 class
public class Main2 {
	public static void main(String[] args) {
		Window w =new Window();
		w.button1.touch();
		w.button2.touch();
	}

}
