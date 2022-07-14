package sapients;

public class spiralMatrix3X3 {
	
	public static void main(String[] args) {
		int[][] array = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		int i,j;
		
		//first row
		for(i=0;i<=0;i++) {
			for(j=0;j<3;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		//last columns
		for(i=1;i<3;i++) {
			for(j=2;j<=2;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		//last row
		for(i=2;i<=2;i++) {
			for(j=1;j>=0;j--) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		//first column
		for(i=1;i>0;i--) {
			for(j=0;j<=0;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		//middle element
		for(i=1;i<=1;i++) {
			for(j=1;j<=1;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
	}

}
