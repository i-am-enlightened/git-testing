package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class FourWheeler {
	
	private String name;
	
	public FourWheeler() {
		super();
	}

	public FourWheeler(String name) {
		super();
		this.name = name;
	}

	public void getName() {
		System.out.println("Truck");
	}
}

public class car implements Cloneable  {

	/*
	 * public void getName() { System.out.println("Car"); }
	 * 
	 * public static void main(String[] args) { car c1 = new car(); FourWheeler f1 =
	 * new car();
	 * 
	 * c1.getName(); f1.getName();
	 * 
	 * 
	 * }
	 */
	private final static List<String> carParts = new ArrayList<>();
	
	

	public static List<String> getCarparts() {
		List<String> newCarList = new ArrayList<>();
		Iterator<String> iterator = carParts.iterator();
		while(iterator.hasNext()) {
			newCarList.add(iterator.next());
		}
		return newCarList;
	}
	
	

	
	
}
