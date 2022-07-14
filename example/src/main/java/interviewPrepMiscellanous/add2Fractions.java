package interviewPrepMiscellanous;

public class add2Fractions {
	
	public static String add2Fractions(String fraction1, String fraction2) {
		String[] fr1 = fraction1.split("/");
		String[] fr2 = fraction2.split("/");
		String fraction3="";
		
		int num1 = Integer.parseInt(fr1[0]);
		int denom1 = Integer.parseInt(fr1[1]);
		
		int num2 = Integer.parseInt(fr2[0]);
		int denom2 = Integer.parseInt(fr2[1]);
		
		if(denom1==0 || denom2==0) {
			return "Addition not possible as denominator is 0";
		}
		else if(denom1<0) {
			num1 = num1*-1;
			denom1 = denom1*-1;
		}
		else if(denom2<0) {
			num2 = num2*-1;
			denom2 = denom2*-1;
		}
		
		if(denom1==denom2) {
			num1 = num1+num2;
			fraction3 = new String(String.valueOf(num1)+"/"+String.valueOf(denom1));
			System.out.println("Added sum: "+fraction3);
		}
		
		if(denom1!=denom2) {
			num1 = num1*denom2;
			num2 = num2*denom1;
			denom1=denom1*denom2;
			fraction3 = new String(String.valueOf(num1+num2)+"/"+String.valueOf(denom1));
			System.out.println("Added sum: "+fraction3);
		}	
		
		return fraction3;
	}
		
	public static void main(String[] args) {
//		String fraction1 = "2/5";
//		String fraction2 = "1/4";
		
//		String fraction1 = "2/-1";
//		String fraction2 = "1/4";
		
//		String fraction1 = "2/-5";
//		String fraction2 = "-9/4";
		
		String fraction1 = "-2/-5";
		String fraction2 = "-9/4";
		
		String fraction3 = add2Fractions(fraction1, fraction2);
		System.out.println(fraction3);
	}

}
