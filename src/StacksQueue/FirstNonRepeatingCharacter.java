package StacksQueue;

import java.util.ArrayList;

public class FirstNonRepeatingCharacter {
	
	private void function(String s){
		ArrayList<Character> al = new ArrayList<>();
		boolean[] repeated = new boolean[26];
		for(int i=0;i<s.length();i++){
			char x = s.charAt(i);
			if(!repeated[x-'a']){
				if(!al.contains(x)){
					al.add(x);
				}else{
					al.remove((Character)x);
					repeated[x-'a']=true;
				}
			}
			if(al.size() != 0){
				System.out.println(al.get(0));
			}
		}
	}
	
	public static void main(String[] args){
		FirstNonRepeatingCharacter f = new FirstNonRepeatingCharacter();
		f.function("geeksforgeeks");
	}
	
	
}
