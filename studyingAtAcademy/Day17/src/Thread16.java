class PrintThread3 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("스레드 실행중...");
			if(Thread.interrupted() == true) {
/* 1.interrupted() ,isInterrupted() 2개의 메서드는 일시 정지를 만들지 않고도 interrupt()가 호출되었
 * 는지를 알수 있다. 즉interrupt()가 호출되면 true를 반환한다.
 * 2.interrupted()는 정적 메서드이고, isInterrupted()는 인스턴스 메서드이다.
 */
				break; //무한루프문 종료
			}//if
		}//while
		System.out.println("스레드 자원정리중...");
		System.out.println("스레드 종료....");
	}//run()
}
public class Thread16 {
	public static void main(String[] args) {
		Thread th=new PrintThread3();
		th.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		th.interrupt();
	}
}
