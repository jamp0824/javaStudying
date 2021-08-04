public class ArrayTest15 {
	public static void main(String[] args) {
		
		String[] names= {"Kim","Park","Yi"};
		
		for(int i =0;i<names.length;i++) {
			System.out.println("name["+i+"]="+names[i]);
		}
		
		String temp =names[2]; //3번째 배열원소 Yi 저앚ㅇ
		System.out.println("temp : "+temp);
		names[0]="Yu"; //첫번째 배열원소값을 Kim에서 Yu로 변경
		
		System.out.println("\n===========> 바뀌어진 배열원소값 <=======");
		for(String name:names) {
			System.out.println(name);
		}
		
		
	}

}
