public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);

    }

    public static void printSquareStar(int number) {
        int row = 0;
        int column = 0;
        while (row <= number && column <= number) {
            if ((row == 0) || (row == number)) {
                while (column < number) {
                    System.out.print("*");
                    column++;
                }
                row++;
                continue;
            }
            System.out.println();
            column = 0;
            while (column <= number) {
                if ((row == column) || (column == ((number - row) + 1)) || (column == 1) || (column == number)) {
                    System.out.print("*");
                    column++;
                } else {
                    System.out.print(" ");
                    column++;
                }
            }
            row++;
        }
    }
}
