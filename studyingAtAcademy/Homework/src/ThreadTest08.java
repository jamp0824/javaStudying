class Atm{//Atm 계좌
	//은행 계좌 잔액
private int money;
public Atm(int m) {//생성자
	money =m; //계좌 개설시 입금한 금액
}

synchronized void deposit(int amount, String name) {//입금
	money+=amount;
	System.out.println(name+":입금금액:"+amount);
}

synchronized void withdraw(int amount, String name) {//출금
	if((money-amount)>0){//출금 가능하면
		money-=amount;
		System.out.println(name+":출금금액:"+amount);
	}else {
		System.out.println(name+": 출금못함(잔액이 부족)");
	}
}


public void getmoney() {
	System.out.println("     계좌 잔액은:"+money);
}
}

class AtmUser extends Thread{//Atm 사용자
	boolean flag=false; //입금/인출
	Atm obj;
	public AtmUser(Atm obj,String name) {
	 super(name);
	 this.obj=obj;
	}
public void run() {
	for(int i=0; i<5; i++) {
		try {
			sleep(500);
		}catch(InterruptedException e) {}
		
	if(flag) {//200-1200
		obj.deposit((int)(Math.random()*10+2)*100,getName());
		obj.getmoney();
	}
	else {
		obj.withdraw((int)(Math.random()*10+2)*100,getName());
		obj.getmoney();
	}
	
	flag = !flag; 
	}
}
}
public class ThreadTest08 {
public static void main(String[] args) {
	Atm obj=new Atm(1000); //Atm계좌 개설 하여 1000원 입금
	AtmUser user1= new AtmUser(obj,"성윤정"); //3명이 동일 계좌에엇 입출금 함
	AtmUser user2= new AtmUser(obj,"전수빈");
	AtmUser user3= new AtmUser(obj,"전원지");
	user1.start();
	user2.start();
	user3.start();
}
}
