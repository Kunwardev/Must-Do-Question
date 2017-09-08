package String;

public class PermutationsOfString {
	
	private String swap(String str, int l, int i){
		char temp;
		char[] strArray = str.toCharArray();
		temp = strArray[l];
		strArray[l] = strArray[i];
		strArray[i] = temp;
		return String.valueOf(strArray);
	}
	
	private void permute(String a,int l,int r){
		if(l == r){
			System.out.println(a);
		}else{
			for(int i=l;i<=r;i++){
				a = swap(a, l, i);
				permute(a, l+1, r);
				a = swap(a, l, i);
			}
		}
	}
	
	public static void main(String[] args){
		PermutationsOfString p = new PermutationsOfString();
		p.permute("ABC", 0, 2);
	}
	
}
