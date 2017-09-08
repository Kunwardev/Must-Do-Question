package BitMagic;

public class FindFirstSetBit {
	
	private int function(int x){
		
		int count = 1;
		while((x & 1) != 1){
			x = x >> 1;
			count++;
			if(x == 0)
				return -1;
		}
		return count;
	}
	
	public static void main(String[] args){
		int x = 0;
		FindFirstSetBit f = new FindFirstSetBit();
		System.out.println(f.function(x));
	}
	
}
