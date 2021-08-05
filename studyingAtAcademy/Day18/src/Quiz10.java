import java.util.Arrays;
import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		System.out.print("수를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		int sum=0;
		int [] iarr=new int[num];
		while(i< num) {
			iarr[i]=i+1;
			i++;
		}
		System.out.println(Arrays.toString(iarr));
	}

}
