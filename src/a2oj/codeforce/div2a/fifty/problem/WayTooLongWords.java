package a2oj.codeforce.div2a.fifty.problem;

/**
 *  Problem - https://codeforces.com/problemset/problem/71/A
 *  
 *  SOlution - 
 *  
 */
import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
			String  str = input.next();
			StringBuilder sb = new StringBuilder();
			if (str.length() >10)
			{
				char ch[] = str.toCharArray();
				sb.append(ch[0]);
				int countLen = str.substring(1, str.length() - 1).length();
				sb.append(String.valueOf(countLen));
				sb.append(ch[ch.length - 1]);
				System.out.println(sb.toString());
			}
			else {
				System.out.println(str);
			}

		}
	}


}
