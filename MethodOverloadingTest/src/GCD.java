public class GCD {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));

    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int lower = 0;
        int higher = 0;
        if(first < second){
            lower = first;
            higher = second;
        }
        else{
            higher = first;
            lower = second;
        }
        int gcd = 0;
        int i = 1;
        while (lower / i > 0){
            i++;
            if (lower % i == 0){
                if (higher % i == 0){
                    gcd = i;
                }else continue;
            }else continue;

        }
        return gcd;
    }
    public static int getGCD (int lower, int higher){
        int gcd = 0;
        int i = 1;
        while (lower / i > 0){
            i++;
            if (lower % i == 0){
                if (higher % i == 0){
                    gcd = i;
                }else continue;
            }else continue;

        }
        return gcd;
    }
}
