package interviewPrep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
	
	private int index;
	private String name;
	private float price;
	
	public Product(int index, String name, float price) {
		super();
		this.index = index;
		this.name = name;
		this.price = price;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [index=" + index + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		int id = this.index;
		Product pnew = (Product) obj;
		int newID = pnew.index;
		
		if(id==newID) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		Integer new1 = new Integer(this.index);
		return new1.hashCode();
	}
}

public class x2 {
	
	public static void main(String[] args) {
		List<Product> list1 = new ArrayList<>();
		list1.add(new Product(1, "Fridge", 25000f));
		list1.add(new Product(2, "AC", 45000f));
		list1.add(new Product(3, "TV", 25500f));
		list1.add(new Product(3, "Washing Machine", 25500f));
		
		Set<Product> set1 = new HashSet<>();
		set1 = list1.stream().filter(p -> p.getPrice()>20000f).collect(Collectors.toSet());
		
		Iterator<Product> itr = set1.iterator();
		while(itr.hasNext()) {
			Product p1 = itr.next();
			System.out.println(p1);
		}
		
	}

}
