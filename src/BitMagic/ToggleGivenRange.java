package BitMagic;

public class ToggleGivenRange {
	
	private int function(int x, int l, int r){
		
		int num = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1);
		return (x ^ num);
	}
	
	public static void main(String[] args){
		ToggleGivenRange t = new ToggleGivenRange();
		System.out.println(t.function(50, 2, 5));
	}
	
}
