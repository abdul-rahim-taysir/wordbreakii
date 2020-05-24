package word;

import java.util.ArrayList;
import java.util.Set;

/**
 * Solved by Abdul Rahim Tayseer 1163095
 * This is another solution
 */

public class a2 {
	
	
	
	public static ArrayList<String> wordBreak(String s, Set<String> dict) {
		
		ArrayList<String> res = new ArrayList<>();
		int[] len = new int[s.length()];
		String[][] hebing1 = new String[s.length()][s.length() * s.length()];
		boolean[] dp = new boolean[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			
		if (dict.contains(s.substring(0,i + 1))){
		hebing1[i][len[i]++] = s.substring(0,i + 1);
		dp[i] = true;
		}
		
		for (int j = 0; j < i; j++) {
		dp[i] = true;
		if (dp[j] && dict.contains(s.substring(j + 1 , i + 1))) {
		for (int k = 0; k < len[j]; k++) {
		hebing1[i][len[i]++] = hebing1[j][k] + " " + s.substring(j + 1,i + 1);
		}
		}
		}
		
		}
		
		
		for (int i = 0; i < len[s.length() - 1]; i++) {
		if (hebing1[s.length() -1][i] != null){
		res.add(hebing1[s.length() -1][i]);
		}
		}
		
		return res;
		}

}
