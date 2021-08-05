class Util2{
	static <T extends Number> int compare(T t1,T t2) {
/*	<T extends Number>는 제한된 제네릭 타입문법이다. 즉 Number타입 또는 그 자손 타입만 와야 한다. 
 */
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue(); //기본 실수숫자로 변경
		return Double.compare(v1, v2); // v1이 v2보다 작으면 -1, 같으면 0, 더크면 1
	}
}
public class Generic03 {
	public static void main(String[] args) {
		int result01 = Util2.compare(10, 20);
		System.out.println(result01); //-1
		int result02 = Util2.compare(10.3, 5.3);
		System.out.println(result02); //1
		int result03 = Util2.compare(5.5, 5.5);
		System.out.println(result03);
	}

}
