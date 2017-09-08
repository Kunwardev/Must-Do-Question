package BitMagic;

public class CheckPowerOf2 {
	
	private int function(int x){
		while(x != 0){
			if((x & 1) == 1){
				if(x == 1)
					return 1;
				else
					return 0;
			}
			x = x >> 1;
		}
		return 0;
	}
	
	public static void main(String[] args){
		CheckPowerOf2 c = new CheckPowerOf2();
		System.out.println(c.function(16));
	}
	
}
