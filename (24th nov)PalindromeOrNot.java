public class PalindromeOrNot {
        public static void isPalindrome(String str) {
            int start=0;
            int end=str.length()-1;
            while(start<end) {
                if(str.charAt(start)!=str.charAt(end)) {
                    System.out.println("Not a plindorme");
                    break;
                }
                start++;
                end--;
            }
            System.out.println(str+" Is a plindorme");
        }
        public static void main(String[] args) {
            String s="Venky";
            isPalindrome(s);
        }
    
    }