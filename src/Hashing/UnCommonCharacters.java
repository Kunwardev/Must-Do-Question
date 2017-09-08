package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class UnCommonCharacters {
	
	private String function(char[] a, char[] b){
		
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		
		for(char p: a){
			if(!hm1.containsKey(p))
				hm1.put(p, 1);
		}
		
		for(char q: b){
			if(!hm2.containsKey(q))
				hm2.put(q, 1);
		}
		ArrayList<Character> al = new ArrayList<>();
		for(char p: b){
			if(!hm1.containsKey(p) && !al.contains(p)){
				al.add(p);
			}
		}
		for(char q: a){
			if(!hm2.containsKey(q) && !al.contains(q))
				al.add(q);
		}
		
		Collections.sort(al);
		return al.toString();
	}
	
	public static void main(String[] args){
		String a = "characters";
		String b = "alphabets";
		UnCommonCharacters u = new UnCommonCharacters();
		System.out.println(u.function(a.toCharArray(), b.toCharArray()));
	}
	
}
