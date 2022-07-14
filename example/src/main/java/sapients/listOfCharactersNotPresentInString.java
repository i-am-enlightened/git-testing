package sapients;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listOfCharactersNotPresentInString {
	
	public static void main(String[] args) {
		String x = "Online test with Xactly";
		x = x.toUpperCase();
		
		char a = 65;
		int i;
		
		List<Character> characters = new ArrayList<>();
		
		while(a<91) {
			for(i=0;i<x.length();i++) {
				if(x.contains(String.valueOf(a))) {
					continue;
				}
				else {
					if(characters.contains(a)) {
						continue;
					}
					else {
						characters.add(a);
					}
					
				}
			}
			a++;
		}
		
		Iterator<Character> itr = characters.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
