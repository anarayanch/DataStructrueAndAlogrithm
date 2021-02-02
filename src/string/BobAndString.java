package string;

import java.util.Scanner;

/**
 *  Problem --> https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/bob-and-string-easy/description/
 *  
 *  Bob and Khatu both love the string. Bob has a string S and Khatu has a string T. They want to make both string S and T to anagrams of each other. 
 *  Khatu can apply two operations to convert string T to anagram of string S which are given below:
1.) Delete one character from the string T.
2.) Add one character from the string S.

Khatu can apply above both operation as many times he want. Find the minimum number of operations required to convert string T so that both T and S will
 become anagram of each other.
 
 Solution --> 
 freq_array = 
 
 Pending Hai 
 * @author kumar
 *
 */
public class BobAndString {
	
	public static void main(String[] args) {
		
		String S ="code";
		String T="road";
		int result = findCountForAnagram(S , T);
		System.out.println(result);
	}

	private static int findCountForAnagram(String s, String t) {
		
		int freq[] = new int[256]; 
		
		// Put first T into freq array 
		for (int i=0; i < s.length(); i++) {
			freq[s.charAt(i)-'a']++;
		}
		
		// Subtract S frequency From freq array 
		for (int j=0; j < t.length(); j++) {
			freq[t.charAt(j)-'a']--;
		}
		
		int count=0;
		//check the different 
		for (int k=0; k < freq.length; k++) {
				// Must add abs of diff else it might negative value and count will become zero
				count += Math.abs(freq[k]);
		}
		return count;
	}
}
