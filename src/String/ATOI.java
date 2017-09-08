package String;

public class ATOI {
	
	private int function(String a) throws Exception{
		try{
			int b = Integer.parseInt(a) + 0;
			return b;
		}catch(Exception e){
			return -1;
		}
	}
	
	public static void main(String[] args) throws Exception{
		String a = "123";
		String b = "21a";
		ATOI x = new ATOI();
		System.out.println(x.function(a));
		System.out.println(x.function(b));
	}
	
}
