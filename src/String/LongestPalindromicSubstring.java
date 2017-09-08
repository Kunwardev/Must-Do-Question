package String;

public class LongestPalindromicSubstring {
	private String function(String a){
		int n = a.length();
		int start = 0;
		int max_len = 1;
		boolean[][] palindrome = new boolean[n][n];
		
		for(int i=0;i<n;i++){
			palindrome[i][i] = true;
		}
		
		for(int i=0;i<n-1;i++){
			if(a.charAt(i) == a.charAt(i+1))
				palindrome[i][i+1] = true;
				start = i;
				max_len = 2;
		}
		
		for(int i=3;i<=n;i++){
			for(int p=0;p<n-i+1;p++){
				int j = p+i-1;
				if(a.charAt(p) == a.charAt(j) && palindrome[p+1][j-1]){
					max_len = i;
					start = p;
					palindrome[p][j] = true;
				}
			}
		}
		System.out.println(max_len);
		return a.substring(start, start+max_len);
	}
	
	public static void main(String[] args){
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		String a = "banana";
		System.out.println(l.function(a));
	}
	
}
