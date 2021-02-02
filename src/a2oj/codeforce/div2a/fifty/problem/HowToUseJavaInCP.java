package a2oj.codeforce.div2a.fifty.problem;

import java.util.Scanner;

/**
 *  Competitvie Programming is diff than Leetcode, so we have to explicity run the loop for number of test case
 *  So we have to write the code in public static void main
 *  Scanner input = new Scanner (System.in);
 *  int t = input.nextInt(); // for test case
 *  while(t-- > 0){ // till number of test case given 
 *  int k = input.nextInt();
 *  int n= input.nextLong();
 *  
 *  Then write your logic then push your code, then only it will work 
 *  
 *  
 * @author kumar
 *
 */
public class HowToUseJavaInCP {

	public static void main(String[] args) {
		// Taking input from System
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		// For number of Test cases
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
