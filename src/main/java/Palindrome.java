public class Palindrome {
    public static boolean istPalindrome(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "sk";
        String s2 = "ala";
        System.out.println(istPalindrome(s1.toCharArray()));
        System.out.println(istPalindrome(s2.toCharArray()));
    }
}
