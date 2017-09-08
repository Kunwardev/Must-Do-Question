package String;

public class RecurRemoveString {

public String removeAdjacent(String str) {
String uniqueCharString = removeAdjacent(str.toCharArray(),str.length());
System.out.println(" Original String : " + str);
System.out.println(" Removed Adjacent Duplicates " + uniqueCharString);
System.out.println(" —————————————- ");
return uniqueCharString;
}

private String removeAdjacent(char[] str, int len) {

int j = 0;
for (int i = 1; i < len; i++) {

while ((j >= 0) && i < len && (str[i] == str[j])) {
i++;
j--;
}

if (i < len)
str[++j] = str[i];

}

char[] uniqueChar = new char[j + 1];
for (int k = 0; k <= j; k++) {
uniqueChar[k] = str[k];
}

return new String(uniqueChar);
}

public static void main(String args[]) {

RecurRemoveString rad = new RecurRemoveString();

System.out.println(" Removd Adjacent Duplicate characters : ");
System.out.println(" ##################################### ");

rad.removeAdjacent("ABCCBACBA");
rad.removeAdjacent("ABCCBACCCCBAAAA");
rad.removeAdjacent("ABCCBACBA");
rad.removeAdjacent("ABCCBACBA");
rad.removeAdjacent("ABCCBACBAAAAA");
rad.removeAdjacent("ABCCBACBAA");
rad.removeAdjacent("ABCCBACBA");
}
}