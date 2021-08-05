class DataBox{
	private String data;
	
	synchronized String getData() {
		if(this.data==null) {
			try {
				wait();//소비자 스레드를 일시정지시켜 락을 걸어 대기상태로 만듬
			} catch (InterruptedException e) {}	
		}//if
		String returnValue=data;
		System.out.println("소비자 스레드가 읽은 데이터: "+returnValue);
		data=null;
		notify(); //생산자 스레드를 실행대기 상태로 만듬
		return returnValue;
	}//첫번째 동기화 메서드
	
	synchronized void setData(String data) {
		if(this.data !=null) {
			try {
				wait();//생산자 스레드를 일시정지
			}catch(InterruptedException e) {}
		}//if
		this.data=data;
		System.out.println("생산자 스레드가 저장한 자료: "+data);
		notify();//소비자 스레드를 실행 대기 상태로 만듬.
	}//두번째 동기화 메서드
}//스레드 공유클래스

class ProducerThread extends Thread{
 private DataBox dataBox;
 
 public ProducerThread(DataBox dataBox) {
	 this.dataBox=dataBox;
 }
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String data="Data - "+i;
			dataBox.setData(data);
		}
	}
	
}//생산자스레드

class ConsumerThread extends Thread{
	private DataBox dataBox;
	
	ConsumerThread(DataBox dataBox){
		this.dataBox=dataBox;
	}
	
	@Override
	public void run() {
		for(int i =0; i<=3; i++) {
			String data=dataBox.getData();
		}
		
	}
	
}//소비자 스레드

public class Thread13 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread=new ConsumerThread(dataBox);
		producerThread.start();
		consumerThread.start();
	}

}
