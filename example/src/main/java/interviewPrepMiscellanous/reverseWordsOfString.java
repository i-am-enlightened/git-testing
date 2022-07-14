package interviewPrepMiscellanous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class reverseWordsOfString {
	
	public static void main(String[] args) {
		String s = "I want my money back";
		String[] wordArr = s.split(" ");
		int i;
		List<String> wordList = new ArrayList<>();
		
		for(i=0;i<wordArr.length;i++) {
			StringBuilder sbr = new StringBuilder(wordArr[i]);
			sbr.reverse();
			
			wordList.add(sbr.toString());
		}
		
		StringBuilder str = new StringBuilder();
		Iterator<String> itr = wordList.iterator();
		while(itr.hasNext()) {
			str.append(itr.next()+" ");
		}
		
		String newS = str.toString().trim();
		
		System.out.println(newS);
		
	}
}

