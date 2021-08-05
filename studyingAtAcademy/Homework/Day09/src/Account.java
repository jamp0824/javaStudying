
public class Account {//계좌 클래스
	private String ano; //계좌번호
	private String owner; //계좌 소유주
	private int balance; //계좌 잔액
	
	public Account() {}
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String ano,String owner, int balance) {
		this.ano=ano; this.owner=owner; this.balance=balance;
	}
	//각자 이클립스 메뉴로 setter(),getter()메서드를 생성하세요.

}
