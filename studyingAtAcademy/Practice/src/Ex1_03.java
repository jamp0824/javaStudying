public class Ex1_03 {
	public static void main(String[] args) {
		int sum=add(new int[] {100,90,100});
		System.out.println("배열 원소 총합="+sum);
	}//main()

	static int add(int[]score) {
		int sum01=0;
		for(int i:score) {
			sum01+=i;
		}
		return sum01;
	}//add()

}
