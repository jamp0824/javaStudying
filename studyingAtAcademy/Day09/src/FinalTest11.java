import java.lang.reflect.Method;

public class FinalTest11 {
	public static void main(String[] args) {
		
		//Service 클래스로 부터 메서드 정보를 얻음
		Method[] declareMethods = Service.class.getDeclaredMethods();
		
		//Method객체를 하나씩 처리
		for(Method method: declareMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnoation이 적용되었는지 확인
				PrintAnnotation printAnnotation=method.getAnnotation(PrintAnnotation.class);
				//PrinatAnnotation객체 얻기
				System.out.print("["+method.getName()+"]"); //메서드명 출력
				for(int i=0;i<printAnnotation.number();i++) {
					System.out.println(printAnnotation.value()); //구분서 출력
				}//for
				System.out.println(); //줄바꿈=>개행
				
				try {
					method.invoke(new Service());//메서드호출
				}catch(Exception e) {}
					/* try-catch문은 예외처리
					 */
					System.out.println();
			}//if
		}//for
	}
}
