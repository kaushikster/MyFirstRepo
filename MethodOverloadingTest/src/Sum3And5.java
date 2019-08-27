

public class Sum3And5 {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers());
    }
    public static int sumOfNumbers(){
        int counter =0;
        int sum = 0;
        for(int i = 1;i <= 1000;i++){
            if ((i % 3 ==0) && (i % 5 ==0)){
                counter++;
                sum = sum + i;
                System.out.println("Number "+i+" divisible by 3 and 5");
                if(counter == 5){
                    System.out.println("exiting loop");
                    break;
                }

            }
        }return sum;
    }
}
