package test07;

public class DaoExample {
	/*dbWork라는 메소드를 호출할 때 매게 변수가 DataAccessObject Dao라는 인터페이스로 정의 되어 있으므로
	OracleDao 와 MySqlDao를 인터페이스 구현 클래스 구현하되 dao.select(); ~ dao.delete(); 4개의 추상 메소드를 재정의*/
public static void dbWork(DataAccessObject dao) {
		
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();

	}
	

	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
    
	}

}


