        package word;

	import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Set;
	import java.util.Collections;

	/**
	 * Solved by Abdul Rahim Tayseer 1163095
	 * This is another solution
	 */

	public class a1 {
	
	public ArrayList<String> list = new ArrayList<String>();
	public ArrayList<String> stack = new ArrayList<String>();
	public int[][] dp = null;
	
	public ArrayList<String> wordBreak(String s, Set<String> dict) {
	
	if(s == null || "".equals(s.trim()) || dict == null || dict.isEmpty())
	return list;
	
	int[][] dp = new int[s.length()][s.length()];
	
	for(int i = 0; i < s.length(); i++){
	for (int j = i; j < s.length(); j++){
	if(dict.contains(s.substring(i, j+1))){
//		System.out.println(s.substring(i, j+1)+"  "+dict.contains(s.substring(i, j+1)));
	dp[i][j] = 1;
	             }
	     }
	}
		
	 System.out.println("Print Two dimensional (2D) Array:");
	
	 for (int i = 0; i < dp.length; i++) {
		 StringBuilder a = new StringBuilder();
		 a.append("\t");
         for (int j = 0; j < dp[i].length; j++) {
     
             a.append(dp[i][j] + " ");
         }
       System.out.println(a.toString());
           System.out.println();
         }
	 	 
	output(s.length() - 1, s, dp);	
	ArrayList<String> resultList = new ArrayList<String>();
	
	for (int i = list.size() - 1; i >=0; i--){
	resultList.add(list.get(i));
	
	      }
	return resultList;
	}
		
	public void output(int length, String str, int[][] dp) {
					
	if (length == -1){
	StringBuilder sb = new StringBuilder();
	
	for (int i = stack.size() - 1; i >= 0; i--)
	{
	sb.append(stack.get(i));

	if (i != 0){
	sb.append(" ");
	}}
	
	list.add(sb.toString());
	} else {
 
	for (int k = 0; k <= length; k++){ 
	if (dp != null && dp[k][length] == 1){ 
	stack.add(str.substring(k, length+1));	
	output(k - 1, str, dp);
		
	stack.remove(stack.size() - 1);
                	}
	           }
        	}

	
     	}
	
	
	
	
	
	
	
	
	
	
	}

