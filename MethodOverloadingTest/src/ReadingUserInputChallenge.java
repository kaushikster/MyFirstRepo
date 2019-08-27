import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while(i <= 10){
            System.out.println("Enter number #"+i);
            boolean hasNextInt = myScanner.hasNextInt();
            if(hasNextInt){
               sum += myScanner.nextInt();
               i++;
            }
            else {
                System.out.println("Invalid input");
            }
            myScanner.nextLine();
        }
        System.out.println("The sum of numbers = "+ sum);
    }
}
