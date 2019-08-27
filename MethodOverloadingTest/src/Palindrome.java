public class Palindrome {
    public static void main(String[] args) {
        if(isPalindrome(-121))System.out.println("true");
        else System.out.println("false");
    }
    public static boolean isPalindrome(int number){
        int n1;
        int n2;

        if (number < 0){
            number = number * -1;
        }
        String originalNumber = String.valueOf(number);
        String newNumber = "";
        String remainder;
        while(number >0 ){
            remainder = String.valueOf(number % 10);
            number = number / 10;
            newNumber+=remainder;
        }
        if(newNumber.equals(originalNumber)){
            return true;
        }else return false;
    }
}
