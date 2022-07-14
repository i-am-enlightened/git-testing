package sapients;

class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void showOffering() {
		System.out.println("Instance created");
	}
}

public class singletonExample {
	
	public static void main(String[] args) {
		Singleton newInstance  = Singleton.getInstance();
		newInstance.showOffering();
		
		Singleton getInstance  = Singleton.getInstance();
		getInstance.showOffering();
	}

}
