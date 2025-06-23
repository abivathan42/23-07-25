public class RecursivePalindrome {
    static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String word = "madam";
        System.out.println(isPalindrome(word, 0, word.length() - 1) ? "Palindrome" : "Not Palindrome");
    }
}
