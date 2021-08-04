import com.naver.model.DataAccessObject;
import com.naver.model2.MySqlDAO;
import com.naver.model2.OracleDAO;

public class ObjectTest01 {
	void doWOrk(DataAccessObject dao) {
		dao.select(); //다형성 문법에 의한 업캐스팅 후 오버라이딩 된 메서드 호출
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {

		ObjectTest01 obj=new ObjectTest01();
		obj.doWOrk(new OracleDAO());
		obj.doWOrk(new MySqlDAO());
		
	}

}
