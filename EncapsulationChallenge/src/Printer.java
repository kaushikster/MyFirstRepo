public class Printer {

    private int pagesPrinted = 0;
    private int tonerLevel = 100;
    private boolean isDuplexPrinter;

    public Printer( boolean isDuplexPrinter) {
        this.isDuplexPrinter = isDuplexPrinter;
    }
    public void printPaper(){
        if(tonerLevel > 0) {
            if (!isDuplexPrinter) {
                System.out.println("A paper is printed");
                this.pagesPrinted = +1;
                this.tonerLevel = -1;
            } else {
                System.out.println("2 sides are printer");
                this.pagesPrinted = +2;
                this.tonerLevel = -2;
            }
        }
        else System.out.println("Toner level is low at " + getTonerLevel() + " %");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void fillToner(){
        this.tonerLevel = 100;
    }


}
