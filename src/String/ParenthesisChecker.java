package String;

import java.util.Stack;

public class ParenthesisChecker {
	Stack<Character> st = new Stack<>();
	private boolean check(String par){
		char[] checker = par.toCharArray();
		for(int i=0;i<checker.length;i++){
			if(checker[i] == '('){
				st.push(')');
			}else{
				if(st.isEmpty()){
					return false;
				}
				else{
					char p = st.pop();
					if(p != checker[i])
						return false;
				}
			}
		}
		return st.isEmpty();
	}
	
	public static void main(String[] args){
		String a = "((())())";
		ParenthesisChecker p = new ParenthesisChecker();
		System.out.println(p.check(a));
	}
	
}
