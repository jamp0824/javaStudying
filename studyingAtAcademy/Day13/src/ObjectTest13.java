import java.util.Random;

public class ObjectTest13 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+1; //random()에 의해 0.0이상 1.0미만 사이 실수숫자 난수 발생
		//=>*6하면 0.0이상 6.0미만 => int로 형변환 하면 0이상6미만=>+1하면 1이상 7미만 즉 1부터 6사이의 임의의 
		//정수 숫자 난수가 발생
		System.out.println("임의의 주사위 눈번호: "+num);
		
		Random r = new Random();
		int[]selectNumber= new int[6];
		System.out.print("로또번호: ");
		for(int i =0;i<selectNumber.length;i++) {
			selectNumber[i]=r.nextInt(45)+1; //nextInt(45)는 0이상 45미만 사이의 임의의 정수숫자 
			//난수를 발생=>+1하면 1이상 46미만 즉 1부터 45사이의 임의의 정수 숫자 난수가 발생
			System.out.print(selectNumber[i]+" ");
		}
	}
}
