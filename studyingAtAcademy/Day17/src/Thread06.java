import java.awt.Toolkit;

class BeepThread extends Thread{
	//문제) 이클립스 메뉴로 Thread조상클래스의 run()메서드를 오버라이딩을 한다.

	@Override
	public void run() {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=1;i<=5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}

			}
		}
}
public class Thread06 {
	public static void main(String[] args) {
		Thread th=new BeepThread(); //조상타입으로 업캐스팅하면서 스레드 개체 생성
		th.start(); //스레드 시작
		
		for(int i=1;i<=5;i++) {
			System.out.println(" 띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
