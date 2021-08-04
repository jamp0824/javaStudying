import java.util.Random;

public class BreakTest07 {
	public static void main(String[] args) {
/*	문제)while 무한루프문을 사용하여 주사위 번호 1~6까지 무한 난수를 발생시켜 출력하고, 주사위 번호중 6이 발생 했을때 무한루프문을
 * 	중단시키는 코드를 작성하자.
 */	
		
	while(true) {
		int num=(int)((Math.random()*6)+1);
/* Math.random()메서드는 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생->*6하면 0.0이상 6.0미만->(int)
 * 형변환하면 소수점을 버리고 -> 0이상 6미만-> +1을 하면 1이상 7미만 즉 1부터 6사이의 주사위 임의의 번호가 발생 
 */
		if(num==1) {
			System.out.println("주사위 숫자 1번");continue;
		}else if(num==2) {
			System.out.println("주사위 숫자 2번");continue;
		}else if(num==3) {
			System.out.println("주사위 숫자 3번");continue;
		}else if(num==4) {
			System.out.println("주사위 숫자 4번");continue;
		}else if(num==5) {
			System.out.println("주사위 숫자 5번");continue;
		}else {
			System.out.println("주사위 숫자 6번");break;
		}
	}
/*	문제2) for 무한루프문을 사용하여 주사위 번호 1~6까지 무한 난수를 발생시켜 출력하고, 주사위 번호중 4가 발생 했을때 for 반복문을
 * 	중단시킵니다. 단 Math.random()메서드를 사용하지 마시고, 코드를 완성하시오
 */
		Random random = new Random();
		for(;;) { 
			int num=random.nextInt(6)+1;
			if(num==1) {
				System.out.println("주사위 숫자"+num+"입니다"); continue;
			}else if(num==2) {
				System.out.println("주사위 숫자"+num+"입니다"); continue;
			}else if(num==3){
				System.out.println("주사위 숫자"+num+"입니다"); continue;
			}else if(num==4){
				System.out.println("주사위 숫자"+num+"입니다"); break;
			}else if(num==5){
				System.out.println("주사위 숫자"+num+"입니다"); continue;
			}else{
				System.out.println("주사위 숫자"+num+"입니다"); continue;
			}
			
		}
	while(true) {
		int number=(int)(Math.random()*6)+1;	
		System.out.println("주사위 번호:"+number);
		if(number==6) {
			break;// 반복문 중단
		}
	}
	System.out.println("===============>");
	for(;;) {
		int n=random.nextInt(6)+1;	//1부터 6사이 임의의 정수 숫자 발생	//형변환 없고 결과값이 바로 정수 (Math.random)
		System.out.println("주사위 번호:"+n);
		if(n==4) {
			break;
		}
	}
	//생성자를 무한 루프안에서 생성하는 경우 메모리 낭비를 할 수있어 무한루프 바깥으로 생성하는것이 좋다.
	}

}
