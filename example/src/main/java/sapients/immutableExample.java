package sapients;

final class Student {
	final private int id;
	final private String name;
	final private String section;
	
	public Student(int id, String name, String section) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSection() {
		return section;
	}
	
}

public class immutableExample {

}
