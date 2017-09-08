package String;

public class RomanNumberToInteger {
	private int value(char a){
		switch(a){
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return -1;
	}
	
	private int function(String res){
		int number = 0;
		for(int i=0;i<res.length();i++){
			int s1 = value(res.charAt(i));
			if(i+1 < res.length()){
				int s2 = value(res.charAt(i+1));
				if(s1 >= s2){
					res += s1;
				}else{
					res +=(s2 - s1);
					i++;
				}
			}else{
				res = res + s1;
				i++;
			}
		}
		return number;
	}
	
	
	 public static void main(String[] args){
		RomanNumberToInteger r = new RomanNumberToInteger();
		System.out.println(r.function("MCMIV"));
	}
	
}
