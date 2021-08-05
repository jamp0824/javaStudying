interface RemoteControl{
	void turnOn(); //public abstract이 생략된 추상메서드
	void turnOff();
}
class Anonymous2{
	RemoteControl field=new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	}; //익명객체로 멤버변수 초기값으로 대입=> 익명클래스 => Anonymous2$1.class
	
	void method1() {
		RemoteControl localVar=new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다");
			}
			
		}; //익명객체를 지역변수 초기값으로 대입
		localVar.turnOn();
		localVar.turnOff();
	}//method1()
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}//Anonymous2
public class AnonymousExample2 {
	public static void main(String[] args) {
		Anonymous2 anony=new Anonymous2();
		anony.field.turnOn();
		anony.field.turnOff();
		anony.method1();
		
		anony.method2(new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("스마트 TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("스마트 TV를 끕니다.");
			}
			
		});//익명클래스=>AnonymousExample2$1.class
	}
}
