package String;

import java.util.LinkedHashMap;

public class RemoveDuplicates {
	private String function(String a){
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length();i++){
			if(!lhm.containsKey(a.charAt(i))){
				lhm.put(a.charAt(i), 1);
				sb.append(a.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		RemoveDuplicates r = new RemoveDuplicates();
		System.out.println(r.function("geeks for geeks"));
		
	}
	
}
