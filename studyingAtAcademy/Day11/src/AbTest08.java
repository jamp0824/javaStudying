class Final08{
	final int TEST=10;
/* 자바상수 특징)
 * 1.변수를 final로 선언하면 수정할 수 없는 변수 즉 상수가 된다. 상수는 선언과 동시에 초기화를 해야 하고 
 * 관례적으로 영문대문자로 한다.
 * 2.상수는 값을 수정 못한다.
 */
	public void setTest(int test) {
		//this.TEST=test; //상수명은 값을 수정못한다.=>컴파일 에러 발생.
	}
}
public class AbTest08 {

	public static void main(String[] args) {

	}

}
