
public class Quiz01 {
	public static void main(String[] args) {
		int random=(int)(Math.random()*100)+1;
		String result=(random%2==0)?"짝수":"홀수";
		System.out.println("랜덤수는: "+random);
		System.out.println("3항 연산의 결과: "+result);
	}
}
