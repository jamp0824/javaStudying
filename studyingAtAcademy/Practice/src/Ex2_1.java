import java.util.ArrayList;
import java.util.List;

public class Ex2_1 {
    public static void main(String[] args) {
    	List<String> nameList=new ArrayList<String>();
        nameList.add("seoul");
        nameList.add("busan");

        for(String arr: nameList){
          
          System.out.println(arr.toUpperCase());
        }
  }
}