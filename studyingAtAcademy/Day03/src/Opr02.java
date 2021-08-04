public class Opr02 {
	public static void main(String[] args) {
		int num01 = 10;
		int num02 = 10;
		
		boolean result = (num01==num02); //==은 같다 연산
		System.out.println(num01+"=="+num02+" : 0"+result);
		
		result = (num01!=num02); //!=같지 않다
		System.out.println(num01+ " !="+num02+" : "+result);
		
		result = (num01<=num02); 
		System.out.println(num01+ " <="+num02+" : "+result);
		
		char char01 ='A'; //단일문자 'A'는 십진수 정수값으로 저장되기 떄문에 비교연산을 할 수 있다.
		char char02 ='B';
		result=(char01<char02);
		System.out.println(char01+"<"+char02+":"+result);
		
		
		
		
		
	}

}
