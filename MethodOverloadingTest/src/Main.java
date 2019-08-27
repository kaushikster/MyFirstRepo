public class Main {
    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6,-1);
        System.out.println(centimeters);
        centimeters = calcFeetAndInchesToCentimeters(24);
        System.out.println(centimeters);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <= 0 || inches <=0 || inches >12){
            return -1;
        }else {
            return ((feet * 12) + inches) * 2.54;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }else {
            double newInches = inches % 12;
            double newFeet = inches / 12;
            return  calcFeetAndInchesToCentimeters(newFeet,newInches);
        }
    }
}
