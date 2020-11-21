package string;

import java.util.Scanner;
/**
 *  Problem - https://www.codechef.com/problems/IT2
 *  
 *  Solution - freq array or Hashing 
 * @author kumar
 *
 */
public class LostNames {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- >0) {
			String firstName=input.next();
			String secondName =input.next();
			String jumbleLetter =input.next();
			helpBantaWithLostNames(firstName , secondName , jumbleLetter);
		}
	}

	private static void helpBantaWithLostNames(String firstName, String secondName, String jumbleLetter) {
		    int[] freq = new int[256];
		    // Put Jumbled letter into freq array first - This approach will save lot of Iteration
	        for (int i = 0; i < jumbleLetter.length(); ++i) 
	        {
	        	freq[jumbleLetter.charAt(i)]++;
	        }
	        // Now subtract first string 
	        for (int i = 0; i < firstName.length(); ++i) 
	        {
	        	// if freq array has no index or negative index then print NO
	            if (freq[firstName.charAt(i)] <= 0)
	                System.out.println("NO");
	            else 
	                freq[firstName.charAt(i)]--;
	        }
	        // Subtract second array 
	        for (int i = 0; i < secondName.length(); ++i) {
	            if (freq[secondName.charAt(i)] <= 0)
	                System.out.println("NO");
	            else 
	            	freq[secondName.charAt(i)]--;
	        }
	        // Else Print YES
	       System.out.println("YES");
	}

}
