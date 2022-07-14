package sapients;

import java.util.Optional;

public class firstNonRepeatingCharacterFromString {
	
	public static void main(String[] args) {
//		String s = "axckisfqaxckisf";
		String s = "concordia";
		char[] charArray = s.toCharArray();
		Optional<Character> unique=null;
		int i,j;
		boolean check=false;
		
		for(i=0;i<charArray.length;i++) {
			check=false;
			for(j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					check=true;
				}
			}
			if(!check) {
				unique=Optional.ofNullable(charArray[i]);
				break;
			}
		}
		
		if(unique.isPresent()) {
			System.out.println("Unique Character: "+unique.get());
		}
		else {
			System.out.println("No unique character found");
		}
		
		
	}

}
