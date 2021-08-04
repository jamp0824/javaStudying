public class ArrayMethod03 {
	public static void main(String[] args) {
		
		int[] arr01 = new int[3];
		//배열 크기가 3인 arr01 배열 생성 -> 기본값 0이 할당.
		for(int i=0;i<arr01.length;i++) {
			System.out.println("arr01["+i+"] :"+arr01[i]);
			
		}
		System.out.println("\n=========>");
		
		arr01[0]=10;
		arr01[1]=20; arr01[2]=30;
		for(int a:arr01) {
			System.out.println(a+" ");
			
		}
		System.out.println("\n=========>");
		double[] arr02 =new double[3];
		//double타입 배열에는 기본값 0.0이 저장
		for(int i=0;i<arr02.length;i++) {
			System.out.println("arr02["+i+"] :"+arr02[i]);
		}
		System.out.println("\n===============>");
		
		String[] arr03 =new String[2]; //String 타입 참조 타입 기본값은 null입니다.
		for(int i=0;i<arr03.length;i++) {
			System.out.println("arr03["+i+"] : "+arr03);
		}
	}

}
