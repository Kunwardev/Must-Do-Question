package Hashing;

import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CheckIfFrequenciesAreEqual {
	
	private boolean function(String s){
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<s.length();i++){
			if(hm.containsKey(s.charAt(i)))
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			else
				hm.put(s.charAt(i), 1);
		}
		int count_2 = 0;
		for(Character e: hm.keySet()){
			if(hm.get(e) > 2)
				return false;
			else if(hm.get(e) == 2 && count_2 > 1)
				return false;
			else if(hm.get(e) == 2)
				count_2++;
		}
		return true;
	}
	
	public static void main(String[] args){
		String a = "xyzz";
		CheckIfFrequenciesAreEqual c = new CheckIfFrequenciesAreEqual();
		System.out.println(c.function(a));
	}
	
}
