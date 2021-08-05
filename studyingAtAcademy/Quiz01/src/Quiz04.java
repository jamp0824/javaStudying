class Account{
	String name;
	String password;
	int balance;
	
	
	Account(){}
	Account(String name, String password, int balance){
		this.name=name;
		this.password=password;
		this.balance=balance;
	}
	void deposit(int money){
		balance+=money;
	}
	void withdraw(int money){
		balance-=money;
	}
	int getBalance() {
		return balance;
	}
}
public class Quiz04 {
public static void main(String[] args) {
	Account myAcc = new Account("홍길동","1234",3600);
	
	myAcc.deposit(800);
	myAcc.withdraw(1900);
	
	int bal = myAcc.getBalance();
	System.out.println(myAcc.name+"님의 현재 잔액은 :"+bal+"원입니다.");
	
}
}
