import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread22 {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		//중앙처리장치(cpu) 코어 개수만큼 최대 스레드를 사용하는 스레드 풀을 생성
		
		System.out.println("[작업 처리 요청]");
		Callable<Integer> task=new Callable<Integer>() {//스레드 풀의 스레드가 작업을 완료한 후 에 프로그램의 처리 결과를 얻으려면 작업객체를 Callable을 생성합니다.

			@Override
			public Integer call() throws Exception { //Callable의 메서드 call()
				int sum=0;
				for(int i=1;i<=10;i++) {
					sum+=i;
				}
				return sum;
			}
			
		};
		Future<Integer> future=executorService.submit(task);
		
		try {
			int sum=future.get(); //스레드 작업이 완료될때까지 기다렸다가 처리 결과 누적합을 구함.
			System.out.println("[처리 결과] : "+sum);
			System.out.println("[작업 처리 완료]");
		}catch(Exception e) {
			System.out.println("[예외 발생] : "+e.getMessage());
		}
		executorService.shutdown(); //스레드 풀 종료
	}

}
