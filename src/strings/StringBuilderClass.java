package strings;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder db = new StringBuilder("Hola");
		db.append(" mundo");
		db.insert(5, "Java");
		db.replace(0, 4, "HI");
		db.delete(3, 8);
		db.reverse();
		System.out.println(db);

	}

}
