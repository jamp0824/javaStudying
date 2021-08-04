
public class Data08 {

	public static void main(String[] args) {
		byte byteValue=10;
		int intValue = byteValue; // byte -> int 로 자동형변환
		System.out.println(intValue);
		
		intValue = 500;
		long longValue= intValue; //int-> long으로 자동형변환
		System.out.println(longValue);
		
		intValue = 300;
		float floatValue = intValue;
		System.out.println(floatValue); //int-> float으로 자동형변환

		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue); //int-> double으로 자동형변환
		
	}

}
