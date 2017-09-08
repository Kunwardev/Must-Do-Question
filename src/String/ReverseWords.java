package String;

public class ReverseWords {
	private String function(String a){
		String[] arr = a.split("\\.");
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length-1;i>0;i--){
			sb.append(arr[i]+".");
		}
		sb.append(arr[0]);
		return sb.toString();
	}
	
	public static void main(String[] args){
		String a = "abc.def.mno.pqr";
		ReverseWords r = new ReverseWords();
		System.out.println(r.function(a));
	}
	
}
