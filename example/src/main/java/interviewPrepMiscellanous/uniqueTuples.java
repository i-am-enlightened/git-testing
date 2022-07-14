package interviewPrepMiscellanous;

import java.util.HashSet;
import java.util.Iterator;

public class uniqueTuples {
	
	public static HashSet<String> getTuples(String s,int length) {
		int i=0;
		HashSet<String> set = new HashSet<>();
		while(i+length<=s.length()) {
			String sub = s.substring(i, i+length);
			set.add(sub);
			++i;
		}
		
		return set;
	}
	
	public static void main(String[] args) {
//		String s = "aabc";
		String s = "aab";
		int length=2;
		
		HashSet<String> tuples = getTuples(s, length);
		
		Iterator<String> itr = tuples.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
