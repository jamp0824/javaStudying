public class TryCatch01 {
/* 예외처리 방법)
 *  try{
 *   정상구문이 실행되다가 예외가 발생하면 실행을 멈추고 제어가 catch{}블록으로 옮겨진다.
 *   }catch(예외 처리클래스){
 *    예외처리문장;
 *    } 	
 */
	public static void main(String[] args) {
     int a=10,b01=0,b02=2,result=0;
     
     try {
    	 result=a/b02;
    	 System.out.println(result);
    	 
    	 result=a/b01;//예외가 발생=>정수 숫자 10을 0으로 나누면 예외가 발생한다.
    	 System.out.println(result);//이 문장은 실행안함.
     }catch(Exception e) {
    	 System.out.println("예외 처리:"+e);
     }
	}
}

