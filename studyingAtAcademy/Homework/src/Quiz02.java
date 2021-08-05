
public class Quiz02 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*11)-5;
		int result=(num<0)?-num:num;
		System.out.println("랜덤값:" +num);
		System.out.println(num+"의 절대값은: "+result);
		
	}
}
