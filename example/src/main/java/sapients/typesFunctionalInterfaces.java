package sapients;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class PredicateCheck implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.length()>10;
	}
	
}

class Person {
	private String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class ConsumerCheck implements Consumer<Person> {

	@Override
	public void accept(Person t) {
		t.setName("Test Demo");
	}
	
}

class functionCheck implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return Integer.parseInt(t)*10;
	}
	
}

class SupplierCheck implements Supplier<Double> {

	@Override
	public Double get() {
		// TODO Auto-generated method stub
		return Math.random();
	}
	
}

public class typesFunctionalInterfaces {
	
	public static void main(String[] args) {
		//Predicate Example
//		Predicate<String> ptr = str -> str.length()>5;
		PredicateCheck check = new PredicateCheck();
		
		System.out.println(check.test("Rajiv"));
		
		//Consumer Example
		ConsumerCheck check1 = new ConsumerCheck();
		Person p1 = new Person("Java Test");
		check1.accept(p1);
		System.out.println(p1.getName());
		
		//Function check
		functionCheck f1 = new functionCheck();
		System.out.println(f1.apply("5"));
		
		//Supplier check
		SupplierCheck check2 = new SupplierCheck();
		System.out.println(check2.get());
		
	}

}
