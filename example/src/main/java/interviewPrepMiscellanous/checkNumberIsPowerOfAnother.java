package interviewPrepMiscellanous;

public class checkNumberIsPowerOfAnother {
	
	public static void main(String[] args) {
		int a = 8;
		
		double sqrt = Math.sqrt(a);
		
		double cbrt = Math.cbrt(a);
		
		double absoluteSQRT = Math.round(sqrt);
		
		double absoluteCBRT = Math.round(cbrt);
		
		if(absoluteSQRT==sqrt) {
			System.out.println(a+" is square root of "+(int)absoluteSQRT);
		}
		
		if(absoluteCBRT==cbrt) {
			System.out.println(a+" is cube root of "+(int)absoluteCBRT);
		}
	}

}
