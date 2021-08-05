class Animal{
	void p() {
		System.out.println("짖어라");
	}
}
class Dog extends Animal{

	@Override
	void p() {
		System.out.println("멍멍");
	}
	
}
class Cat extends Animal{

	@Override
	void p() {
		System.out.println("야옹");
	}
	
}

public class Try04 {
	static void changeDog(Animal animal) {//다형성(업캐스팅)
		if(animal instanceof Dog) {
		Dog dog=(Dog)animal; //명시적인 다운캐스팅
		dog.p();
		}else if(animal instanceof Cat) {
			Cat cat=(Cat)animal;
			cat.p();
		}
/* 문제) 어떤 연산자 키워드와 if else if 다중조건문을 사용하여 ClassCastException 이 오류가 안나게 
 * 		즉 형변환 에러가 발생된지 않게 디버깅을 해서 정상프로그램을 만들자.
 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		
		
		changeDog((new Cat()));
	}

}
