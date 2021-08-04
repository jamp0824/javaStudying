/*	확장 특수문자(이스케이프(escape) 문자) 종류.
 *  1. \n : 줄바꿈(개행) 				***
 *  2. \t : 탭키만큼 수평으로 띄움			***
 *  3. \" : "(큰따옴표)로 출력
 *  4. \' : '(작은따옴표)로 출력
 *  5. \\ : \(폴더 경로 구분기호)로 표시		**
 *  6. \r : 커서를 맨앞으로 옮김
 *  7.
 */
public class Data02 {

	public static void main(String[] args) {

		System.out.println("\'서울시\'"); //'서울시'
		System.out.println("\"부산시\""); //"부산시"
		System.out.println("abc\tcde\tfg");
		System.out.println("\n");
		System.out.println("d:\\");//d:\
	}

}
