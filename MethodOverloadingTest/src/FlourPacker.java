public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2,10,18));
    }
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(goal / 5 <= bigCount){
            if (goal % 5 <= smallCount){
                return true;
            }
        }else if(goal / 5 > bigCount){
            int remaining = goal - (5 * bigCount);
            if (remaining <= smallCount){
                return true;
            }
        }
        return false;
    }
}