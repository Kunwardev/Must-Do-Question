package String;

public class StringRotatedTwoTimes {
	// Will fail in the cases, because only checking for the characters
	private boolean function(String a, String b){
		return ((a.charAt(0)==b.charAt(a.length()-2))&&((a.charAt(1)==b.charAt(a.length()-1)))
				||(a.charAt(a.length()-2)==b.charAt(0))&&((a.charAt(a.length()-1)==b.charAt(1))));
	}
	
	private boolean functions(String a, String b){
		StringBuilder sb = new StringBuilder();
		sb.append(b);
		sb.append(b);
		String s = sb.toString();
		return s.contains(a);
		
	}
	
	public static void main(String[] args){
		String a = "geekks";
		String b = "ksamaz";
		String c = "azonam";
		StringRotatedTwoTimes s = new StringRotatedTwoTimes();
		System.out.println(s.functions(a, b));
		System.out.println(s.functions(a, c));
		
	}
	
}
