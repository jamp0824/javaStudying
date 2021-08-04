
public class Data09 {
 public static void main(String[] args) {
	
	 long longValue= 500;
	 int intValue =(int)longValue; //(int) 캐스팅(형변환) 연산자를 사용하여 명시적인 
	 //강제 형변환. long->int
	 System.out.println(intValue);

	 double doubleValue = 3.14;
	 intValue =(int)doubleValue; 	 // 3.14에서 소수점이하는 버리고 정수 숫자값만 좌측변수에 저장됨
	 System.out.println(intValue);	 // 3	
	 
	 doubleValue =85.9;
	 intValue =(int)doubleValue; 	// 반올림 하지 않고 소수점 이하는 버리고 정수값만 취함.
	 System.out.println(intValue);	// 85 	//로그인 인정할때도 많이 쓰임
}
}
