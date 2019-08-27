public class YearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(1440);
    }
    public static void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long years = minutes / (60 * 24 * 365);
            long remainingDays = minutes % (60 * 24 * 365);
            long days = remainingDays / (60 * 24);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
