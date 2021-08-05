class WorkObject{
	synchronized void methodA() {
		System.out.println("Thread의 metodA() 작업 실행");
		notify(); //일시 정지 상태에 있는 ThreadB를 실행 대기상태로 만듬 블록내에서만 사용가능
		try {
			wait();// ThreadA를 일시 정지 상태로 만듬.
		}catch(InterruptedException e) {}
	} //첫번째 동가화 메서드
	
	synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify(); //일시 정지된 ThreadA를 실행대기 상태로 만듬.
		/*	1.notify()메서드는 wait()에 의해서 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다
		 *  2. 이 메서든 Object클래스 메서드이기 때문에 모든 공유 객체 에서 호출 가능하고 , 주의할 점은 동기화 메서드
		 *  동기화 블록내에서만 사용가능하다.
		 * 
		 */
		try {
			wait(); //ThreadB를 일시정지
		}catch(InterruptedException e) {}
	}//두번째 동기화 메서드
}//WorkObject class
class ThreadA extends Thread{
	
	private WorkObject workObject;
	
	ThreadA(WorkObject workObject){
		
		this.workObject=workObject;

	}
	@Override
	public void run() {

		for(int i =1; i<=10;i++) {
			workObject.methodA();
		}
	}
}

class ThreadB extends Thread{
	private WorkObject workObject;

	ThreadB(WorkObject workObject){
		this.workObject=workObject; //맴버변수 초기화
	}//생성자 오버로딩
	@Override
	public void run() {
		for(int i =1; i<=10; i++) {
			workObject.methodB();
		}
	}

}
public class Thread12 {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA=new ThreadA(workObject);
		ThreadB threadB=new ThreadB(workObject);
		threadA.start();
		threadB.start(); //스레드 시작
	}
}
