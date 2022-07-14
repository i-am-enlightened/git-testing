package sapients;

import java.util.HashMap;

public class StringsAreAnagramUsingHasmap {
	
	public static void main(String[] args) {
//		String s1 = "listen";
//		String s2 = "silent";
		
		String s1 = "tam morvolo riddle";
		String s2 = "i am lord voldemort";
		
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		
		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();
		
		int i,j;
		
		for(i=0;i<charArr1.length;i++) {
			if(map1.containsKey(charArr1[i])) {
				int count = (int) map1.get(charArr1[i]);
				map1.put(charArr1[i], count++);
			}
			else {
				map1.put(charArr1[i], 1);
			}
		}
		
		for(i=0;i<charArr2.length;i++) {
			if(map2.containsKey(charArr2[i])) {
				int count = (int) map2.get(charArr1[i]);
				map2.put(charArr2[i], count++);
			}
			else {
				map2.put(charArr2[i], 1);
			}
		}
		
		if(map1.equals(map2)) {
			System.out.println("Strings are anagrams");
		}
		else {
			System.out.println("Strings are not anagrams");
		}
	}

}
