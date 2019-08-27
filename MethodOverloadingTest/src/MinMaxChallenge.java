import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int i = 1;
        int min = 0;
        int max = 0;
        int num;
        while(i <= 5){
            System.out.println("Enter number #"+i);
            boolean hasNextInt = myScanner.hasNextInt();
            if(hasNextInt){
               num = myScanner.nextInt();
               if(i == 1){
                   max = num;
                   min = num;
               }
               else{
                   if(num > max){
                       max = num;
                   }else if (num < min){
                       min = num;
                   }
               }
               i++;
            }
            else {
                System.out.println("Invalid input");
                break;
            }
            myScanner.nextLine();
        }
        System.out.println("Max = "+ max);
        System.out.println("Min = "+ min);
        myScanner.close();
    }
}
