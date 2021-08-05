class PrintThread extends Thread{
	private boolean stop; //기본 false
	
	public void setStop(boolean stop) { //해당메서드가 private이므로 멤버변수 초기화
		this.stop = stop;
	}


	@Override
	public void run() {
		while(!stop) { //!false=>true=>무한루핑(무한루프)
			System.out.println("스레드 실행중");			
		}//while
		System.out.println("스레드 자원 정리중");
		System.out.println("스레드 종료");
	}
	
}

public class Thread14 {
public static void main(String[] args) {
/*	문제)printThread 객체를 생성한 다음 스레드를 시작하고 1초후에 스레드를 종료시켜보자
 * 
 */
	PrintThread printThread =new PrintThread();
	printThread.start();
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {}
			printThread.setStop(true);
		
		
	
}
}
