public class SharedDigit {
    public static void main(String[] args) {
        boolean b = hasSharedDigit(12,13);
        System.out.println(b);

    }
    public static boolean hasSharedDigit(int number1, int number2){
        if(number1 < 0 || number2 < 0 || number1 > 99 || number2 > 99){
            return false;
        }
        int num1firstDigit;
        int num1secondDigit;
        int num2firstDigit;
        int num2secondDigit;
        num1firstDigit = number1 % 10;
        num1secondDigit = number1 / 10;
        num2firstDigit = number2 % 10;
        num2secondDigit = number2 / 10;
        if((num1firstDigit == num2firstDigit) || (num1firstDigit == num2secondDigit) || (num1secondDigit == num2firstDigit) || (num1secondDigit == num2secondDigit)){
            return true;
        }
        else return false;
    }
}
