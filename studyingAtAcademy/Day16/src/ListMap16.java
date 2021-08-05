import java.util.LinkedList;
import java.util.Queue;

class Message{
	String command;
	String to;
	
	Message(String command, String to){
		this.command=command;
		this.to=to;
	}
	
}
public class ListMap16 {
	public static void main(String[] args) {
		Queue<Message> messageQue=new LinkedList<>();
		
		messageQue.offer(new Message("sendMail","홍길동"));
		messageQue.offer(new Message("sendMail","이순신"));
		messageQue.offer(new Message("sendKakaotalk","신사임당님"));
		
		while(!messageQue.isEmpty()) {
			Message message= messageQue.poll(); //큐로부터 메시지를 꺼내오면서 제거
			switch (message.command) {
			case "sendMail": //자바 7부터는 switch case조건식과 case값에 정수식외에 문자열도 함께 올수 있다.
				System.out.println(message.to+"에게 메일을 보냅니다."); break;
			case "sendSMS" : 
				System.out.println(message.to+"에게 문자를 보냅니다."); break;
			case "sendKakaotalk":
				System.out.println(message.to+"에게 톡을 보냅니다."); break;
			default:
				break;
			}
		}
	}
}
