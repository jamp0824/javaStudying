class MovieThread4 extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("동영상 재생");
/*	문제 1) 인터럽트 호출했을때 쓰레드 종료하는 코드를 작성합시다.	
			try {Thread.sleep(10);

*/
			//how 2
			if(this.isInterrupted()) {//==true가 생략됨, 해당 스레드가 인터럽트가 발생되면 참
				break;
			}
		}//무한루프
	
	}//run()
}
public class Thread24 {
	public static void main(String[] args) {

		Thread th = new MovieThread4();
		th.start();

		try {Thread.sleep(1000);}catch(InterruptedException e) {}

		th.interrupt(); //스레드가 일시정지된 

	}
}
