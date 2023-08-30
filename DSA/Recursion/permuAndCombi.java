package DSA.Recursion;

public class permuAndCombi {
    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void combination(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                combination(str, l + 1, r);
                // backtracking
                str = swap(str, l, i);
            }
        }
    }

    public static void main(String[] args) {
        String s = "XYZ";
        combination(s, 0, s.length() - 1);
    }
}
