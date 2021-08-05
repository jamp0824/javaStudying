class Player{
	String name;
	int hp;
	int mp;
	
	void info() {
		System.out.println("케릭명:"+name);
		System.out.println("체력:"+hp);
		System.out.println("마나:"+mp);
		
	}
	
	
}

class Warrior extends Player{
 

	
	void bash() {
		
		System.out.println("때리기 스킬 사용");
	}
	
}
class Wizard extends Player{


	void iceArrow() {
		
		System.out.println("얼음화살 사용");
	}
	
}
public class Quiz05 {
public static void main(String[] args) {
	Wizard wizard = new Wizard();
	wizard.name="구르미그린달빛";
	wizard.hp=1000;
	wizard.mp=500;
	wizard.info();
	wizard.iceArrow();
	
	Warrior warrior = new Warrior();
	warrior.name="강한친구대한천사";
	warrior.hp=500;
	warrior.mp=1000;
	warrior.info();
	warrior.bash();
}
}
