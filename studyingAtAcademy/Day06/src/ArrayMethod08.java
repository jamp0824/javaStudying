public class ArrayMethod08 {
	public static void main(String[] args) {
		
		int[][] mathScore= new int[2][3];
		for(int i=0;i<mathScore.length;i++) {
			for(int j=0;j<mathScore[i].length;j++) {
				System.out.println("mathScore["+i+"]["+j+"]="+mathScore[i][j]);
			}// int 타입 배열 기본값 0이 출력
		}
		System.out.println(); //줄바꿈\
		
		//래기(그)드 배열(ragged array)
		int[][] englishScores= new int[2][]; //행은 2,열의 크기는 지정안함.
		englishScores[0]=new int[2]; //첫번째 행의 열의 길이 2로 지정
		englishScores[1]=new int[3]; //두번째 행의 열의 길이 3
		for(int i=0;i<englishScores.length;i++) {
		for(int j=0;j<englishScores[i].length;j++) {
			System.out.println("englishScores["+i+"]["+j+"]="+englishScores[i][j]);
		}
	}
	System.out.println();
	
	int[][] javaScore= {{95,100},{100,80,100}};
	for(int i=0;i<javaScore.length;i++) {
		for(int j=0;j<javaScore[i].length;j++) {
			System.out.println("javaScore["+i+"]["+j+"] = "+javaScore[i][j]);
		}
	}
	System.out.println();
	
	String[] strArray= new String[3];
	strArray[0]="Java";
	strArray[1]="Java";
	strArray[2]= new String("Java"); //3번째 배열에는 다른 객체주소가 할당.
	
	boolean result=(strArray[0]==strArray[1]); //같은 객체 주소를 공유-> true
	System.out.println(result);
	System.out.println(strArray[0] == strArray[2]); //다른 객체주소를 가짐 -> false
	result = strArray[0].equals(strArray[2]); //문자열 내용을 비교 -> true
	System.out.println(result);
	}

}
