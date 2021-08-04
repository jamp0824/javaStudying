public class Opr04 {
	public static void main(String[] args) {
		
		int charCode = 'A';
/* if 조건문 형식)
 * if(조건식){
 * 조건식이 참이면 실행;
 * }
 */
		if((charCode >= 65)& (charCode <=90)){ //일반연산자
			System.out.println("영문 대문자");
		}//if 
		
		if((97<=charCode)&&(charCode<=122)) { //논리 연산자
			System.out.println("영문 소문자");
		}
		if(!(charCode <=48)&& !(charCode >=57)) {//48이상 57이하일때 참
			System.out.println("0~9사이 숫자");
		}
		
		
		
		
		
		
		
		
		
	}
}
