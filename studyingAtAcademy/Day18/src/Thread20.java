import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Thread20 {
	public static void main(String[] args) throws Exception{
      ExecutorService executorService=Executors.newFixedThreadPool(2);
      //스레드 풀에서 관리하는 최대 스레드 개수가 2인 스레드 풀 생성
      
      for(int i=0;i<10;i++) {
    	  Runnable runnable=new Runnable() {
			@Override
			public void run() {
				//스레드 총개수 및 작업 스레드 이름 출력
				ThreadPoolExecutor threadPoolExecutor=
(ThreadPoolExecutor)executorService;//스레드 풀 실행객체 생성
                 int poolSize=threadPoolExecutor.getPoolSize();//스레드 총개수
                 String threadName=Thread.currentThread().getName();//현재 실행중인 스레드
                 //이름 반환
System.out.println("[총 스레드 개수: "+poolSize+"] 작업 스레드이름: "+threadName);  
                 //예외발생
                 int value=Integer.parseInt("삼");
			}    		  
    	  };//익명클래스 문법으로 스레드 생성=>외부클래스$번호.class
    	  //작업처리 요청
    	  executorService.execute(runnable);//작업스레드 이름이 모두 다르다=>
//작업 처리 도중 예외가 발생하면 스레드가 종료되고 해당 스레드는 스레드 풀에서 제거되고 스레드 풀은 다른 작업처리를
//위해서 새로운 스레드를 계속 생성하기 때문이다.
    	  //executorService.submit(runnable) 
    	  //작업 처리도중 예외가 발생하더라도 스레드는 종료되지 않고 계속 재사용된다.
    	  
    	  Thread.sleep(10);//이클립스 콘솔에 출력시간을 주기 위해서 잠시 일시 저정
      }//for
      executorService.shutdown();//스레드 풀 종료=>현재 처리중인 작업뿐만이 아니라 작업 큐에 대기하고 있
      //는 모든 작업을 처리한 뒤에 스레드 풀을 종료시칸다.즉 남아 있는 작업을 마무리 하고 스레드 풀을 종료.
	}
}
