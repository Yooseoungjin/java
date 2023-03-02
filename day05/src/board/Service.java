package board;

public class Service {

	DAO dao;

	// Service 사용이 시작 될때 dao도 생성된다(초기화되서 실행 된다는말)
	public Service() {
		// Security or Log
		dao = new DAO();
	}

	public void register(String str) {
		dao.insert(str);
	}

	public void remove(int num) {
		dao.delete(num);
	}

	public void modify(int num, String str) {
		dao.update(num, str);
	}

	public String get(int num) {
		return dao.select(num);
		
	}
}
