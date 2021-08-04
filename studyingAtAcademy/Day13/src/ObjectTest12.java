public class ObjectTest12 {
	public static void main(String[] args) {
/* 래퍼(Wrapper:포장하다) 클래스 란?
 * 1. 래퍼클래스는 자바의 기본타입 8개를 포장해서 클래스화 한것을 말한다.
 * 2. 래퍼클래스 종류)
 * 		기본타입 래퍼클래스
 * 		byte	Byte
 * 		short 	Short
 * 		char	Character
 * 		int		Integer
 * 		long	Long	
 * 		float	Float
 * 		double 	Double
 * 		boolean	Boolean
 * 
 * 		자바 5에서 추가된 오토박싱(자동박싱),오토언박싱(자동언박싱)
 * 		1.오토박싱은 기본타입을 래퍼클래스 타입으로 자동형 변환을 하는 뜻한다.
 * 		2.오토박싱은 참조 래퍼클래스 타입을 기본타입으로 변환하는 것을 말한다.
 */
		Integer obj = 100; // 기본 int 타입값 100 이 참조타입 Integer obj변수에 대입 => 오토박싱
		System.out.println(obj.intValue());//intValue()메서드는 기본타입 정수 숫자로 변환
		
		int value=obj; //오토언박싱
		System.out.println("오토언박싱된 value = "+value);
		
		int result = obj+100; //연산시 오토언박싱되면서 덧셈
		int value1 = Integer.parseInt("10"); //문자열 10을 정수 숫자로 변경
		System.out.println(value1);
		double value2 = Double.parseDouble("10.3");
		System.out.println(value2);
	}

}
