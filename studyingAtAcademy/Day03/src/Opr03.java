public class Opr03 {
	public static void main(String[] args) {
		
		int a =10, b=10;
		boolean result = false;
		
		result = (a==b); //기본타입 값을 ==로 비교하면 값을 비교하다.
		System.out.println(a+"=="+b+":"+result);
		
		String pwd01= "1234";
		String pwd02= "1234";
		String pwd03 = new String("1234"); // new 연산 키워드로 새로운 객체명 pwd03을 생성함. 그러면
		//새로운 번지(객체주소)가 할당한다. 결국 pwd01과 pwd02는 같은 객체주소를 가리키고, pwd03은 객체주소가 다르다.
	
		result = (pwd01 == pwd02); //문자열 값을 ==로 비교하면 객체주소값을 비교한다.
		System.out.println(pwd01+"=="+pwd02+":"+result);
		
		result = (pwd01 ==pwd03);
		System.out.println(pwd01+"=="+pwd02+":"+result); //문자열 값 1234는 같은데 주소
		//값이 달라져서 false
		
		result = (pwd01.equals(pwd03));// String클래스의 equals()메서드로 비교하면 문자열값만
		//비교한다.=>true
		System.out.println("\""+pwd01+"\""+" equals(\""+pwd02+"\"):"+result);
		
		int value = 6;
/*	문제) 6을 2또는 3으로 나눈 나머지값이 무엇일때 2또는 3의 배수이다. 라고 출력되게 한다.
 */
		
		if ((value % 2 == 0)||(value % 3 == 0)) {
			System.out.println(value+"는 2또는 3의 배수이다");
		}
		if (( value % 2 == 0)|(value % 3 == 0)) {//연산 속도가 느리고 둘다 비교해서 계산하므로 잘 안쓰임
			System.out.println(value+"는 2또는 3의 배수이다");
		}
		
	}
}
