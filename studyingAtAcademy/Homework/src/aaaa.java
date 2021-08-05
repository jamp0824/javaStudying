
public class aaaa {
	public static void main(String[] args) {
		System.out.println("약수의 개수: " + primeNum(3));

	}
	
	static int primeNum(int a) {
		int result = 0;
		for (int i = 2; i <= a; i++) {
			int count=0;
			for (int j=1;j <= i; j++) {
				if(i % j ==0) {
					count++;
					//카운트가 3이상이면 다음수로 (내부 for문 탈출)
				}//if
				
				//카운트가 3이상이면 다음수로 (내부 for문 탈출)
			}// inner for
			if (count ==2) {
				result++; 
				//나누어 떨어진 수가 2개 였으면 약수의 개수를 하나 증가시킴
			}//if
		}//outter for
		return result;
	}
}
