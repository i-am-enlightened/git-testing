package sapients;

public class printSpiralMatrix4X4 {
	
	public static void main(String[] args) {
		int[][] array = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		int i,j;
		
		//print first row
		for(i=0;i<=0;i++) {
			for(j=0;j<4;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		//print last column
		for(i=1;i<4;i++) {
			for(j=3;j<4;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		//print last row
		for(i=3;i<4;i++) {
			for(j=2;j>-1;j--) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		//print first column
		for(i=2;i>0;i--) {
			for(j=0;j<1;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
	}

}
