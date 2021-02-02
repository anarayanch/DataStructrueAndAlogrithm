package recursion;

/**
 *  Problem - https://www.hackerrank.com/challenges/string-mingling/problem
 *  
 * @author kumar
 *
 */
public class StringMingling {

	public static void main(String[] args) {

		String s ="hacker";
		String p="ranker";
		mergeTwo(s,p,"", 0 , 0);//apbqcrdset
		
	}

	private static void mergeTwo(String s, String p, String res, int slen, int plen) {
		
		if (slen > s.length() || plen > p.length()) {
			return;
		}
		if (slen ==s.length() || plen == p.length()) {
			System.out.println(res);
		}
		if (slen <s.length() && plen <p.length()) {
			res = res+s.charAt(slen)+p.charAt(plen);
			mergeTwo(s , p, res, slen+1, plen+1);
		}
		
	}
	

}
