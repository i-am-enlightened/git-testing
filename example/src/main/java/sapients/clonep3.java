package sapients;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class clonep3 {
	
	public static void main(String[] args) {
		String s1 = "I am invited to party";
		int i; 	
		char[] s1ar = s1.toCharArray();
		StringBuilder builder = new StringBuilder();
		
		for(i=s1ar.length-1;i>-1;i--) {
			builder.append(s1ar[i]);
		}
		
//		System.out.println(builder.toString());
		
		
		String s2 = "I am invited to party";
		StringBuilder bdr = new StringBuilder(s2);
		bdr.append(" ");
		
		s2 = bdr.toString();
		String[] s2Array = s2.split(" ");
		List<String> s2List = new ArrayList<>();
		
		for(i=s2Array.length-1;i>-1;i--) {
			s2List.add(s2Array[i]);
		}
		
		s2Array = (String[]) s2List.toArray();
		
		for(i=0;i>-1;i--) {
			s2List.add(s2Array[i]);
		}
	}

}
