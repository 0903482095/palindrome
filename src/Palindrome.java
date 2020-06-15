public class Palindrome {
    private boolean isPalindrome(int number) {
        if (number < 0)
            return false;
        int div = (int) Math.pow(10, String.valueOf(number).length() - 1);
        while (number != 0) {
            int left = number / div;
            int right = number % 10;
            if (left != right)
                return false;
            number = (number % div) / 10;
            div /= 100;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(121);
    }
}
