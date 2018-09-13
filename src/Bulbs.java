import java.util.*;
import java.util.HashMap;

public class Bulbs {
    public static int solution(int[] A) {
        int totalCount = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
            int tempCount=0;
            for(int j=1;j<=hs.size();j++){
                if(hs.contains(j)){
                    tempCount++;
                }
            }
            if(tempCount==hs.size()){
                totalCount++;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {

    }
}
