package codingexercises;

public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z){
        
        for (int i=13; i<20;i++){
            if (x ==i || y ==i || z ==i){
                return true;
            }
        }
        return false;
    }
 
}
