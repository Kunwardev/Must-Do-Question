package BitMagic;

public class RightMostDifferentBit {
	
	private int function(int x, int y){
		int z = x ^ y;
		if(z == 0)
			return -1;
		int count = 1;
		while((z & 1) != 1){
			z = z >> 1;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		int x = 52, y = 4;
		RightMostDifferentBit r = new RightMostDifferentBit();
		System.out.println(r.function(x, y));
	}
	
}
