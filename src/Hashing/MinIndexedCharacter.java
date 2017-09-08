package Hashing;

import java.util.HashMap;

public class MinIndexedCharacter {
	
	private char function(char[] str, char[] pat){
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<pat.length;i++){
			hm.put(pat[i], i);
		}
		for(int i=0;i<str.length;i++){
			if(hm.containsKey(str[i]))
				return str[i];
		}
		return '1';
	}
	
	public static void main(String[] args){
		MinIndexedCharacter m = new MinIndexedCharacter();
		String str = "geeksforgeeks";
		String pat = "set";
		System.out.println(m.function(str.toCharArray(), pat.toCharArray()));
	}
	
}
