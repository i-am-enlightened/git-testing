package interviewPrepMiscellanous;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentElection {
	
	public static int studentPresident(int[] studentArray,int songLength) {
		LinkedList<Integer> list = new LinkedList<>();
		int i;
		
		for(i=0;i<studentArray.length;i++) {
			list.add(studentArray[i]);
		}
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] studentArray = {1,2,3,4};
		int songLength = 2;
		
		int student = studentPresident(studentArray, songLength);
	}

}
