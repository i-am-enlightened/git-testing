package interviewPrepMiscellanous;

public class robotMovement {
	
	public static int[] walk(String steps) {
		int i;
		int x=0;
		int y=0;
		
		for(i=0;i<steps.length();i++) {
			if(steps.charAt(i)=='U') {
				++x;
			}
			else if(steps.charAt(i)=='D') {
				--x;
			}
			else if(steps.charAt(i)=='L') {
				--y;
			}
			else if(steps.charAt(i)=='R') {
				++y;
			}
		}
		
		int[] currentPosition = new int[2];
		currentPosition[0] = x;
		currentPosition[1] = y;
		
		return currentPosition;
	}
	
	public static void main(String[] args) {
//			String steps = "UUU";
//			String steps = "ULDR";
			String steps = "ULLLDUDUURLRLR";
			
			int[] currentSteps = walk(steps);
			System.out.println("Curent Position: ("+currentSteps[0]+","+currentSteps[1]+")");
	}

}
