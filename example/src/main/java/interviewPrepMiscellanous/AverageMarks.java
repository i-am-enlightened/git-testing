package interviewPrepMiscellanous;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private String name;
	private float marks;
	
	public Employee(String name, float marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
}


public class AverageMarks {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Ajay", 45f));
		empList.add(new Employee("Rahul", 64.6f));
		empList.add(new Employee("Karan", 78.9f));
		
		float totalMarks = empList.stream().map(p -> p.getMarks()).reduce(0f, (p1,p2)-> p1+p2);
		float average = totalMarks/empList.size();
		
		System.out.println("Average of Marks "+average);	
		
		System.out.println("Average of Marks "+totalMarks);
	}

}
