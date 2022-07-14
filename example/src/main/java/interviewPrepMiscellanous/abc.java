package interviewPrepMiscellanous;

public class abc {
	
	public static void printSpiralMatrix(int ROW, int COL, int[][] arr) {
		int currROW=0,currCOL=0;
		int i;
		
		while(currROW<ROW && currCOL<COL) {
			
			for(i=currCOL;i<COL;++i) {
				System.out.print(arr[currROW][i]+" ");
			}
			currROW++;
			
			for(i=currROW;i<ROW;++i) {
				System.out.print(arr[i][COL-1]+" ");
			}
			COL--;
			
			if(currROW<ROW) {
				for(i=COL-1;i>=currCOL;--i) {
					System.out.print(arr[ROW-1][i]+" ");
				}
				ROW--;
			}
			
			if(currCOL<COL) {
				for(i=ROW-1;i>=currROW;--i) {
					System.out.print(arr[i][currCOL]+" ");
				}
				currCOL++;
			}
		}
	}
	
	public static void main(String[] args) {
//		int [][] arr = {{1,2,3},
//						{4,5,6},
//						{7,8,9}};
		
		int [][] arr = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		
		int ROW = arr.length;
		int COL = arr[0].length;
		
		printSpiralMatrix(ROW,COL,arr);
	}

}
