/* 3항 연산식을 이용해서 1~100까지의 3의 배수 합을 구하기
 * 
 */
public class Test2 {
 public static void main(String[] args) {
	 int sum=0;
	 for(int i =1;i<=100;i++) {
		 int a=(i%3==0)?sum+=i:i;
	 }System.out.println(sum);
}
}
