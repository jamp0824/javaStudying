public class TryCatch02 {
/* 	복수개의 catch{}블록을 사용할 때는 예외처리 자손클래스를 먼저 기술해야 한다. 	
 */
	public static void main(String[] args) {
     int a=10,b01=0,b02=2,result=0;
     
     try {
    	 result=a/b02;
    	 System.out.println(result);
    	 
    	 result=a/b01;//예외가 발생하고 아래문장 실행하지 않고 실행순서가 catch 블록으로 옮겨진다.
    	 System.out.println(result);
     }catch(ArithmeticException ae) {
    	 System.out.println("예외처리 1 : "+ae);
     }catch(Exception e) {
    	 System.out.println("예외처리 2 : "+e);
     }
	}
}
