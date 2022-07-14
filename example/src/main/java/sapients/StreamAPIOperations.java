package sapients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class product {
	private int id;
	private String name;
	private float price;
	private String category;
	
	public product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public product(int id, String name, float price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class StreamAPIOperations {
	
	public static void main(String[] args) {
//		List<product> list = new ArrayList<>();
//		list.add(new product(1,"lamp",45000.0f));
//		list.add(new product(2,"TV",30000.0f));
//		list.add(new product(3,"Mobile",35000.0f));
//		
//		product minPriceProduct = list.stream().min(new Comparator<product>() {	
//			@Override
//			public int compare(product o1, product o2) {
//				// TODO Auto-generated method stub
//				return o1.getPrice()>o2.getPrice()?1:-1;
//			}		
//		}).get();
//		
//		System.out.println(minPriceProduct);
//		
//		product minproduct = list.stream().min((p1,p2)-> p1.getPrice()>p2.getPrice()?1:-1).get();
//		
//		System.out.println(minproduct);
		
		List<product> list = new ArrayList<>();
		list.add(new product(1,"book1",250f,"cooking"));
		list.add(new product(2,"book2",350f,"bikes"));
		list.add(new product(3,"book3",2150f,"cards"));
		list.add(new product(4,"book4",1150f,"paints"));
		list.add(new product(5,"book5",1050f,"toys"));
		list.add(new product(6,"book6",3050f,"clothes"));
		list.add(new product(7,"book7",6050f,"toys"));
		
		//find numbers starting with 1
		List<Integer> list2 = Arrays.asList(10,15,8,1119,1,98,32,111);
				
		List<Integer> list1 = list2.stream().filter(p -> {
			while(p>1) {
				p = p/10;
			}
			if(p==1) {
				return true;
			}
			else {
				return false;
			}	
		}).collect(Collectors.toList());
		
		System.out.println(list1);
		
		//Find first element
		int first = list2.stream().findFirst().get();
		System.out.println("Find first: "+first);
		
		List<Integer> list4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		//find duplicate elements
		HashSet<Integer> setter = new HashSet<>();
		list4.stream().filter(p -> !setter.add(p)).forEach(System.out::println);
		
	}

}
