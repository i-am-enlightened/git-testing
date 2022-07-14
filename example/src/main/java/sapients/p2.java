package sapients;

public class p2 {
	
	public static void main(String[] args) {
		int[] ar = {3,6,2,1,4,5,8};
		int i,j;
		int temp=0;
		
		for(i=0;i<ar.length;i++) {
			for(j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		for(i=0;i<ar.length;i++) {
			if(ar[i]!=i+1) {
				System.out.println("Missing number "+(i+1));
			}
		}
		
		
	}

}
