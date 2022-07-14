package interviewPrepMiscellanous;

import java.util.Optional;

public class AtoiConversion {
	
	public static Optional<Integer> atoiFunction(String s) {
		char[] ch = s.toCharArray();
		int i;
		int count=0;
		
		for(i=0;i<ch.length;i++) {
			if((ch[i]>47 && ch[i]<58)) {
				count++;
			}
		}
		
//		if(count==s.length()) {
//			return Optional.of(Integer.valueOf(s));
//		}
//		else {
//			return Optional.ofNullable(null);
//		}
		
		try {
			Optional<Integer> num = Optional.ofNullable(Integer.valueOf(s));
			return num;
		}
		catch(NumberFormatException e) {
			System.out.println("Conversion not possible as non-numeric digit is present");
		}
		finally {
			return Optional.ofNullable(null);
		}
		
	}
	
	public static void main(String[] args) {
		String s = "32a45";
		
		Optional<Integer> num = atoiFunction(s);
		if(num.isPresent()) {
			System.out.println("Converted Integer: "+num.get());
		}
		else {
			System.out.println("Conversion Fails");
		}
	}

}
