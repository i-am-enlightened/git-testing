package sapients;

public class findMissingNumberInArray {
	
	public static void main(String[] args) {
		int[] arr = {4,5,7,3,2,8};
		int i,j;
		int temp=0 ;
		
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
//		for(i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		int min,max=0;
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		min=max;
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		temp=0;
		for(i=min;i<=max;i++) {
			if(arr[temp]==i) {
				temp++;
				continue;	
			}
			else {
				 System.out.println("Missing number: "+i);
				 break;
			}
		}
		
	}

}
