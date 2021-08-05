import java.util.Arrays;
import java.util.Scanner;

public class MyFood {
	public static void main(String[] args) {
		System.out.println("# 먹고 싶은 음식을 입력하세요!!");
		System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int count=0;
		String [] arr = new String[100];
		while(true) {
			String food= sc.nextLine();
			
			if(food.equals("그만")) {
				
				System.out.println("그만!!");
				break;
			}//if 
			arr[count]=food;
			count++;
			}//while
		for(int i =0;i<count;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
