public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(0));
    }
    public static int getLargestPrime(int number){
        if(number <=1){
            return -1;
        }
        int i = 2;
        while(i < number){
            if (number % i != 0){
                i++;
                continue;
            }
            while(number % i ==0 && i < number){
                number /= i;
            }
        }
        return number;
    }
}