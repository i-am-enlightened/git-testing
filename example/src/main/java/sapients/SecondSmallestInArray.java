package sapients;

public class SecondSmallestInArray {
	
	public static void main(String[] args) {
		int[] array = {7,4,1,6,2,8};
		int max=0;
		int i;
		int second=0;
		
		for(i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		for(i=0;i<array.length;i++) {
			if(array[i]>second && array[i]<max) {
				second=array[i];
			}
		}
		
		System.out.println("2nd Largest "+second);
		
		
	}

}
