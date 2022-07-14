package interviewPrepMiscellanous;

public class magicPotion {
	
	private static String magicPotion(String s1) {
		int count = 1;
		int i = 1;
		StringBuilder sb = new StringBuilder();
		sb.append(s1.charAt(0));
		
		while (i < s1.length()) {
			if (s1.length() >= 2 * i && s1.charAt(i) == s1.charAt(0)) {
				if (s1.substring(0, i).equals(s1.substring(i, 2 * i))) {
					i += i - 1;
					sb.append("*");
				} else
					sb.append(s1.charAt(i));
			} else {
				sb.append(s1.charAt(i));
			}
			count++;
			i++;
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s1 = "A,B,A,B,C,A,B,A,B,C,E";
		
		System.out.println(magicPotion(s1));

	}

}
