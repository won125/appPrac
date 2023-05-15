package javaClass;

public class OracleDao implements DataAccesObject{
	
	private String db= "Oracle";

	@Override
	public void insert() {
		System.out.println(db+" DB에서 삽입");
		
	}

	@Override
	public void select() {
		System.out.println(db+" DB에서 검색");
		
	}

	@Override
	public void update() {
		System.out.println(db+" DB에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println(db+" DB에서 삭제");
		
	}

}
