public class TeenNumberChecker {
    public static boolean hasTeen(int a,int b,int c){
        boolean firstInt=isTeen(a);
        boolean secondInt=isTeen(b);
        boolean thirdInt=isTeen(c);
        if(firstInt || secondInt || thirdInt){
            return true;
        }else return false;
    }
    public static boolean isTeen(int i){
        if(i >= 13 && i <=19){
            return true;
        }else return false;
    }
}
