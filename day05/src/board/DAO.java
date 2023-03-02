package board;

public class DAO {
	public void insert(String str) {
		System.out.println("Inserted Oracle Databese Row: "+str);
	}

	public void update(int num, String str) {
		System.out.println("Update Oracle Databese Row: "+num+" "+str);
	}

	public void delete(int num) {
		System.out.println("Deleted Oracle Databese Row: "+num);
	}

	public String select(int num) {
		return "Hi Database...";
	}
}
