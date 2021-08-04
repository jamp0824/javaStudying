public class ArrayMethod11 {

	public static void main(String[] args) {
		
		Week today=Week.SUNDAY;
		String name=today.name(); //name()은 열거 객체가 가지고 있는 문자열 반환
		System.out.println(name);
		
		int ordinal = today.ordinal(); //ordinal()은 열거타입 상수의 순번을 반환(0부터 시작)
		System.out.println(ordinal);  //6
		
		Week day1=Week.MONDAY; //순번 0
		Week day2=Week.WEDNESDAY;	//순번 2
		int result01= day1.compareTo(day2); // 열거 객체를 비교해서 순번차이를 반환. 0-2=-2
		System.out.println(result01);
		result01=day2.compareTo(day1); //2-0=2
		System.out.println(result01);
		
		if(args.length == 1) {//문자열 배열원소값 한개 전달
			String strDay=args[0];//첫번째 배열원소값 저장
			Week weekDay=Week.valueOf(strDay); //valueOf()는 주어진 문자열의 열거 객체를 반환

			if(weekDay ==Week.SATURDAY|| weekDay ==Week.SUNDAY) {
				//토요일 이거나 일요일이면 참
			System.out.println("주말이군요");
			}else {
				System.out.println("평일이군요");
			}
		}//if
		
		Week[] days=Week.values(); //values()는 모든 열거객체들을 배열로 반환
		for(Week day:days) {
			System.out.print(day+" ");
		}
		
	}

}
