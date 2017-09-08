package String;

import java.util.Arrays;
import java.util.HashMap;

public class LongestDistinctCharacter {
	
	private int function(String a){
		boolean[] visited = new boolean[26];
		int count = 0, max = 0;
		for(int i=0;i<a.length();i++){
			if(visited[a.charAt(i)-'a']){
				max = Math.max(count, max);
				count = 0;
				Arrays.fill(visited, false);
			}else{
				count++;
				visited[a.charAt(i)-'a'] = true;
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		String a = "abababcdefababcdab";
		String n = "geeksforgeeks";
		LongestDistinctCharacter l = new LongestDistinctCharacter();
		System.out.println(l.function(a));
		System.out.println(l.function(n));
	}
	
}
