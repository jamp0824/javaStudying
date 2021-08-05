import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Result{
	int accumValue;

	synchronized void addValue(int value) {//동기화 메서드
		accumValue += value;
	}
}//처리 결과를 저장할 Result클래스
public class thread23 {
	public static void main(String[] args) {
		//작업 처리 결과를 외부 객체에 저장
		ExecutorService executorService=
				Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업 처리 요청]");

		class Task implements Runnable{
			Result result;

			Task(Result result){
				this.result=result;
			}

			@Override
			public void run() {
				int sum=0;
				for(int i =1;i<=10;i++) {
					sum+=i;
				}//for
				result.addValue(sum); //외부 객체에 작업결과 즉 누적합을 저장
			}
		}//로컬 지역클래스 =>Thread23$1Task.class(외부클래스$번호내부클래스명.class)
		Result result=new Result();
		Runnable task1=new Task(result);
		Runnable task2=new Task(result);
		Future<Result> future1=executorService.submit(task1,result); //첫번째 스레드 작업결과를 얻기 위한 퓨처객체를 생성
		Future<Result> future2=executorService.submit(task2,result); //task2 스레드 작업을 스레드풀의 작업큐에 저장학 반환된 
		//future2를 통해 작업처리 결과를 받는다
		
		try {
			result= future1.get(); //첫번째 작업결과를 얻음
			result= future2.get(); //두번째 작업결과를 얻음
			System.out.println("[처리 결과] : "+result.accumValue);
		}catch(Exception e) {
			e.printStackTrace(); System.out.println("[예외 발생] : "+e.getMessage()); //2개의 스레드 작업결과를 취함=>55_
		}
		executorService.shutdown(); //스레드 풀 종료
	}
}
