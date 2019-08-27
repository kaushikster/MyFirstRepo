public class NumberToWords {
    // Not working
    public static void main(String[] args) {
        System.out.println(100 % 15);
        getDigitCount(100);
        System.out.println(numberToWords(100));

    }
    public static String numberToWords(int number){
        if(number < 0){
            return "Invalid Value";
        }
        String word = "";
        int reversedNumber = reverse(number);
        while (reversedNumber % 10 >0){
            switch (reversedNumber % 10){
                case 1 : word+=" One";break;
                case 2 : word+=" Two";break;
                case 3 : word+=" Three";break;
                case 4 : word+=" Four";break;
                case 5 : word+=" Five";break;
                case 6 : word+=" Six";break;
                case 7 : word+=" Seven";break;
                case 8 : word+=" Eight";break;
                case 9 : word+=" Nine";break;
                case 0 : word+=" Zero";break;
            }
            reversedNumber /= 10;
        }
        return word.trim();
    }
    public static int reverse(int number){
        int remainingDigit;
        int digits = getDigitCount(number);
        int multiplier = 1;
        int i = 1;
        while(i < digits){
            multiplier *= 10;
            i++;
        }
        int reversedNumber = 0;

        while (number % 10 > 0){
            remainingDigit = number % 10;
            number /= 10;
            remainingDigit *= multiplier;
            reversedNumber += remainingDigit;
            multiplier /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int i = 1;
        while (number / 10 >= 1){
            number /= 10;
            i++;
        }
        return i;
    }
}
