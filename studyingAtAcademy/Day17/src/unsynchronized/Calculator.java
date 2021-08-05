package unsynchronized;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	public synchronized void setMemory(int memory) { //계산기 메모리에 값을 저장시키는 메서드
		this.memory=memory;
		try {
		 Thread.sleep(2000); //스레드를 2초간 일시정지
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		//Thread.currentThread().getName*()은 현재 실행중인 스레드 이름을 반환
/*	//synchronized키워드로 동기화 메서드를 만들면 임계영역에 되어져서 한번에 하나의 스레드에 의해서만
   //스레드 문장이 실행됨. 
 * 문제)synchronized 패키지를 생성하고 Thread10 클래스를 만들고 unsynchronized의 해당클래스를 공유해서 
 * 		동기화 즉 임계영역을 처리하여 Usser1
 */
	}
}
