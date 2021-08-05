import java.util.Random;

public class MonteHall {

	public static void main(String[] args) {



		int testno = 100;

		Random random = new Random();

		// 오로지 0번만 선택

		int choice = 0;



		System.out.println("난 심지있는사람! 결과를 바꾸지 않는다");

		int resultcnt = 0;

		

		//문의 종류는 0번,1번,2번이다.

		for (int i = 0; i < testno; i++) {

			int car = random.nextInt(3);// 0,1,2

			if (choice == car)

				resultcnt++;

		}

		System.out.println("Result: " + (double) resultcnt / (double) testno);



		choice = 0;

		resultcnt = 0;

		System.out.println("결과를 바꾸면?");

		for (int i = 0; i < testno; i++) {

			int car = random.nextInt(3);// 0,1,2



			// change!

			if (car == 0) {

				// 사회자는 나머지 문 2개중 아무거나 열어준다.

				choice = random.nextInt(2) + 1;

			} else if (car == 1) {

				// 사회자는 열어 줄 문이 2번문 뿐이다. 그래서 선택을 바꾼다면 바꿀 수 있는 문은 1번문 뿐이다.

				choice = 1;

			} else if( car == 2){

				// 사회자는 열어 줄 문이 1번문 뿐이다. 그래서 선택을 바꾼다면 바꿀 수 있는 문은 2번문 뿐이다.

				choice = 2;

			}



			if (choice == car)

				resultcnt++;

		}

		System.out.println("Result: " + (double) resultcnt / (double) testno);



	}

}






//위와 같이 돌릴 경우

//Random함수를 썼기때문에 결과는 바뀔 수 있다(testno의 변수를 늘리면 정확해짐)



//난 심지있는사람! 결과를 바꾸지 않는다

//Result: 0.31

//결과를 바꾸면?

//Result: 0.67