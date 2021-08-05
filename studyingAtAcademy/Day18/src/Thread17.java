class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업할 내용을 저장함");

	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			save();
		}//while
	}//run()
}

public class Thread17 {
	public static void main(String[] args) {
		AutoSaveThread autoTh=new AutoSaveThread();
		autoTh.setDaemon(true); //메인스레드 즉 주스레드의 보조역활을 하는 데몬스레드 만듬
		autoTh.start();

		try {Thread.sleep(3000);}catch(InterruptedException e) {}
		System.out.println("메인 주스레드 종료"); //주 스레드가 종료되면 데몬 스레드는 강제적으로 자동종료
	}
}
