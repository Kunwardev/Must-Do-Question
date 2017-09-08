package Hashing;

import java.util.HashMap;

public class FindFirstRepeated {
	
	private char function(char[] arr){
		HashMap<Character, Character> l = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(l.containsKey(arr[i]))
				return arr[i];
			else
				l.put(arr[i],'1');
		}
		return ' ';
	}
	
	public static void main(String[] args){
		String a = "kunwardevsingh";
		FindFirstRepeated f = new FindFirstRepeated();
		System.out.println(f.function(a.toCharArray()));
	}
	
}
