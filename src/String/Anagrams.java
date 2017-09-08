package String;

public class Anagrams {
    
    private boolean function(String a, String b){
        int[] arr = new int[26];
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-'a']++;
        }
        for(int j=0;j<b.length();j++)
            arr[b.charAt(j)-'a']--;
        for(int i=0;i<26;i++){
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Anagrams a = new Anagrams();
        System.out.println(a.function("geeksforgeeks", "forgeeksgeeks"));
    }
    
}
