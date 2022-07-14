package interviewPrepMiscellanous;

public class firstUniqueCharacter {
	
	public static Character getUniqueChar(String s) {
		int i,j,k;
		boolean check=true;
		char c = '1';
		
		for(i=0;i<s.length();i++) {
			check=true;
			
			if(i==0) {
				for(j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						check=false;
					}
				}
			}
			
			else if(i==s.length()-1) {
				continue;
			}
			
			else {
				
				for(j=0;j<i;j++) {
					if(s.charAt(j)==s.charAt(i)) {
						check=false;
					}
				}
				
				for(j=i+1;j<s.length();j++) {
					if(s.charAt(j)==s.charAt(i)) {
						check=false;
					}
				}
			}
			
			if(check) {
				c = s.charAt(i);
				break;
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		String s = "aaaffvvwwiirlloiorrxrrttwwvggkggiii";
		
		char c = getUniqueChar(s);
		System.out.println(c);
		
	}

}
