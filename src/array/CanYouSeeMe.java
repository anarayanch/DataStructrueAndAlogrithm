package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *  Problem - https://www.codechef.com/problems/CYSM
 *  
 *  Solution - Hahshing 
 *  
 *  
 * @author kumar
 *
 */
public class CanYouSeeMe {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t= input.nextInt();
		while (t-->0) {
			String n = input.next();
			char q  = (char) input.nextByte();
			findQTypeFile(n , q);
		}
	}

	private static void findQTypeFile(String n, char q)
	{
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == q) {
				map.put(n.charAt(i), map.getOrDefault(n.charAt(i), 1) + 1);
			}
		}
		// Only printing q character which we want- taking from input value
		for (char ch : map.keySet())
			System.out.println(map.get(ch));
	}

}
