package interviewPrepMiscellanous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AnagramPairs {
	
	public static boolean checkAnagrams(String s1,String s2) {
		HashMap<Character,Integer> hash1 = new HashMap<>();
		HashMap<Character,Integer> hash2 = new HashMap<>();
		
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		int i;
		
		for(i=0;i<char1.length;i++) {
			if(hash1.containsKey(char1[i])) {
				int count = (int) hash1.get(char1[i]);
				hash1.put(char1[i], count+1);
			}
			else {
				hash1.put(char1[i], 1);
			}
		}
		
		for(i=0;i<char2.length;i++) {
			if(hash2.containsKey(char2[i])) {
				int count = (int) hash2.get(char2[i]);
				hash2.put(char2[i], count+1);
			}
			else {
				hash2.put(char2[i], 1);
			}
		}
		
		if(hash1.equals(hash2)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("spar","rasp","bat","dog","butcher","tac","tom","tab","tibby","fally","cat");
		List<String> anagramPair = new ArrayList<>();
		int i,j;
		
		for(i=0;i<list.size()-1;i++) {
			for(j=i+1;j<list.size();j++) { 
				if(checkAnagrams(list.get(i), list.get(j))) {
					anagramPair.add(list.get(i));
					anagramPair.add(list.get(j));
				}
			}
			
		}
		
		Iterator<String> itr = anagramPair.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
