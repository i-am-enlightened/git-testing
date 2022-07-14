package sapients;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class alphabetCount {
	
	public static void main(String[] args) {
		String s = "JAVA PROGRAMMER";
		Map<Character,Integer> mapper = new HashMap<>();
		int i,j;
		
		for(i=0;i<s.length();i++) {
			if(mapper.containsKey(s.charAt(i))) {
				mapper.put(s.charAt(i), mapper.get(s.charAt(i))+1);
			}
			else {
				mapper.put(s.charAt(i), 1);
			}
		}
		
		for(Entry<Character,Integer> entry:mapper.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue()+" ");
		}
		
	}

}
