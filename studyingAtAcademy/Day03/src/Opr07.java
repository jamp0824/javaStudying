public class Opr07 {
	public static void main(String[] args) {
		
		int x =10;
		int y =20;
		int z =(++x)+(y--);//x 변수값 1을 먼저 1증가한 11+20=31을 z변수에 저장한 다음 나중에
		//y변수값을 후행증가
		System.out.println("z ="+z); // 31
		System.out.println("============>");
		
		int pecils = 534; //총 연필개수
		int students = 30; //학생수
		
/*	문제) 학생 한명당 가지는 연필 수를 구해서 출력하고, 그런 다음 남은 연필 수도 구해서 각각 구하는 코드를 
 *  	 작성하시요.
 */
		int pencilPerStudent =pecils/students;
		System.out.println("학생 한명당 가지는 연필 수는 = "+pencilPerStudent);
		int pencilCount = pecils%students;
		System.out.println("남은 연필수 = " +pencilCount);
		
	}
}
