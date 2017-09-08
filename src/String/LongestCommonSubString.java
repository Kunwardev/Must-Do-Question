package String;

public class LongestCommonSubString {
	
	private int max(int a, int b){
		return (a > b) ? a : b;
	}
	
	private int LCS(String a, String b, int m, int n){
		int[][] LCSstuff = new int[m+1][n+1];
		int result = 0;
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i == 0 || j == 0)
					LCSstuff[i][j] = 0;
				else if(a.charAt(i-1) == b.charAt(j-1)){
					LCSstuff[i][j] = LCSstuff[i-1][j-1] + 1;
					result = max(result, LCSstuff[i][j]);
				}else
					LCSstuff[i][j] = 0;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		String X = "OldSite:GeeksforGeeks.org";
		String Y = "NewSite:GeeksQuiz.com";
		LongestCommonSubString l = new LongestCommonSubString();
		System.out.println(l.LCS(X, Y, X.length(),Y.length()));
	}
	
}
