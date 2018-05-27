package verify.exam04;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB 에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB 에서 삽입");		
	}

	@Override
	public void update() {
		System.out.println("MySql DB 에서 수정");		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB 에서 삭제");		
	}
}
