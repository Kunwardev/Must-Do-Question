package BitMagic;

public class CheckIfKBitIsSet {
	
	private int function(int x, int l){
		
		while(l != 0){
			x = x >> 1;
			l--;
		}
		
		return (x & 1);
	}
	
	public static void main(String[] args){
		int x = 4, l = 0;
		CheckIfKBitIsSet c = new CheckIfKBitIsSet();
		System.out.println(c.function(x, l));
	}
	
}
