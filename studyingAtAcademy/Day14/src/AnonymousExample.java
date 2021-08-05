class Person{
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}//Person class
class Anonymous{
	Person field=new Person() {

		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}

	};//익명 객체 문법을 멤버변수 초기값을 대입=>내부무명클래스=>Anonymous$1.class
	void method1() {
		Person localVar=new Person() {

			void walk() {
				System.out.println("산책을 합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}

		};//익명 객체 문법을 지역변수 초기값으로 대입=> Anonymous$2.class
		localVar.wake();
	}//method1()
	void method2(Person person) {
		person.wake();
	}
}
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(
			new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
			
			
			}//익명객체를 메서드 매개변수 인자값으로 통으로 전달=>AnonymousExample$1.class
			);
	}
}


