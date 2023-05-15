package javaClass;

public class DaoEx1 {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}
	public static void dbWork(DataAccesObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
