package Recursion;

public class CountNumberOfPaths {
	
	private int function(int m, int n){
		if(m == 1 || n == 1)
			return 1;
		return function(m-1, n) + function(m, n-1);
	}
	
	public static void main(String[] args){
		int m = 2; int n = 8;
		CountNumberOfPaths c = new CountNumberOfPaths();
		System.out.print(c.function(m, n));
	}
	
}
