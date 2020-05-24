package word;

import java.util.ArrayList;
import java.util.Set;

/**
 * Solved by Abdul Rahim Tayseer 1163095
 * This is another solution
 */


public class a3 {

	public ArrayList<String> wordBreak(String s, Set<String> dict) {
		boolean[][] dp = getDp(s, dict);
		return getSolutions(dp, s, 0);
		}
	
	
		private boolean[][] getDp(String s, Set<String> dict) {
		int sLen = s.length();
		boolean[][] dp = new boolean[sLen][];
		for(int i = sLen - 1; i >= 0; i--) {
		int rowLen = sLen - i;
		dp[i] = new boolean[rowLen];
		for(int j = 0; j < rowLen; j++) {
		String subStr = s.substring(sLen - i - j - 1, sLen - i);
		if(dict.contains(subStr)) {
		dp[i][j] = true;
		}
		}
		}
		return dp;
		}
	
		private ArrayList<String> getSolutions(boolean[][] dp, String s, int layer) {
		ArrayList<String> all = new ArrayList<>();
		if(layer >= s.length()) {
		return all;
		}
		int rowLen = dp[layer].length;
		for(int i = 0; i < rowLen; i++) {
		ArrayList<String> solutions = new ArrayList<>();
		if(dp[layer][i]) {
		String word = s.substring(rowLen - i - 1, rowLen);
		int wc = layer + word.length();
		if(wc == s.length()) {
		solutions.add(word);
		all.addAll(solutions);
		} else {
		ArrayList<String> ret = getSolutions(dp, s, wc);
		if(!ret.isEmpty()){
		for(String str : ret) {
		solutions.add(str + " " + word);
		}
		all.addAll(solutions);
		}
		}
		}
		}
		return all;
		}
		
		
}
