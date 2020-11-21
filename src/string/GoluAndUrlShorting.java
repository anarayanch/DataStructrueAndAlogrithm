package string;
/**
 *  Problem - https://www.codechef.com/problems/FEST03
 *  
 *  SOlution - Hashing Or Freq Array with 256 Size 
 *  
 *  
 * @author kumar
 *
 */
public class GoluAndUrlShorting {
	
	public static void main(String[] args) {
		String s ="facebook.com/home/";
		findUrlShorting(s);
	}
	private static void findUrlShorting(String s) {
		// Take frequency array of 256 size 
		int freq[] = new int[256];
		// add frequency of character in frequency array
		for (int i=0; i<s.length(); i++) {
			// Math.abs else / will give array out of bound
			freq[Math.abs(s.charAt(i)-'a')]++; 
		}
		StringBuilder sb = new StringBuilder();
		sb.append("ocul.in/");
		//Now need to find only 3 top frequency
		int i=0;
		while (i < 3) {
			int ind=0;
			// Find Max of every Iteration
			for (int j=0; j<256; j++) {
				if (freq[j] > freq[ind]) {
					ind =j;
				}
			}
			// Converting int to char
			char ch = (char) (ind+'a');
			// append character
			sb.append(ch);
			// append frequency from array
			sb.append(freq[ind]);
			//Now make index of that in frequency array 0 else it will pick again
			freq[ind]=0;
			ind=0;
			i++;
		}
		System.out.println(sb.toString());
	}
}
