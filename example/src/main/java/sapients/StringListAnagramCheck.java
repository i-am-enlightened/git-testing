//package sapients;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//public class StringListAnagramCheck {
//	
//	public static void main(String[] args) {
//		List<String> list1 = Arrays.asList("cat","tab","bat","cab","act");
//		int length = list1.size();
//	}
//	
//	public boolean checkAnagrams(String s1,String s2) {
//		char[] array1 = s1.toCharArray();
//		char[] array2 = s2.toCharArray();
//		
//		HashMap<Character,Integer> hash1 = new HashMap<>();
//		HashMap<Character,Integer> hash2 = new HashMap<>();
//	}
//	
//	public List<String> anagramList(List<String> list1,int length) {
//		int i,j;
//		List<String> list2 = new ArrayList<>();
//		for(i=0;i<length;i++) {
//			for(j=i+1;j<length;j++) {
//				if(checkAnagrams(list1.get(i),list1.get(j))) {
//					list2.add(list1.get(i));
//					list2.add(list1.get(j));
//				}
//			}
//		}
//		return null;
//		
//	}
//
//}
