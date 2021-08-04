
public class ConsTest12 {
	public static void main(String[] args) {
		int a=40,b=30,re=0;
		re=Math.max(a, b); //a,b 두수중 최대값을 구함. 여기서 사용하는 max()는 정적메서드
		System.out.println(a+"와"+b+" 두 수중 최대값"+re);
		
		System.out.println("원주율 값="+Math.PI); //PI는 정적상수로서 원주율값을 저장하고 있다.
		int r =5;
		double area=0.0;
		area=r*r*Math.PI; //원의 면적=반지름*반지름*원주율 
		System.out.println("반지름이 "+r+"인 원의 면적="+area);
	}
}
