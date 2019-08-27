import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your dob:");
        myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Enter your name:");
        String name = myScanner.nextLine();
        System.out.println("The name is : "+name);
        myScanner.close();
    }
}
