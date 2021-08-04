class CellPhone{
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
	System.out.println("벨이 울립니다.");	
	}
	void sendVoice(String message) {
		System.out.println("자기: "+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: "+message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}//CellPhone class

class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model,String color,int channel){
		this.model=model; this.color=color; this.channel=channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널: "+channel+"번으로 바꿉니다.");
		
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
}

public class FinalTest13 {
	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone=new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("폰모델: "+dmbCellPhone.model);
		System.out.println("폰색상: "+dmbCellPhone.color); //model,color는 상속받아서 사용
		System.out.println("채널번호: "+dmbCellPhone.channel);
		
		//상속받은 메서드 호출
		dmbCellPhone.powerOn(); dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요.저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
