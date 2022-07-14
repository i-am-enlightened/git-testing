package sapients;

import java.util.Arrays;

public class anagramStrings {
	
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		char[] char1 = s1.toLowerCase().toCharArray();
		char[] char2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if(Arrays.equals(char1, char2)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not anagrams");
		}
		
//		s1 = String.valueOf(char1);
//		s2 = String.valueOf(char2);
		
//		if(s1.equals(s2)) {
//			System.out.println("Anagrams");
//		}
//		else {
//			System.out.println("Not anagrams");
//		}
		
		
	}
}
