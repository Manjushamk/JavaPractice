import java.util.ArrayList;
import java.util.List;

public class ShortestDistance {
    List<List<Integer>> ClosestXdestination(int numDestinations,List<List<Integer>> allocations, int numdeliveries){
        return null;
    }

    public static double distance(int x1, int x2){
        return Math.sqrt(Math.pow(x1,2)+ Math.pow(x2,2));
    }

    public static void main(String[] args) {
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        myList.add(l);
        int x1 = 0, x2 =0;
        for (List<Integer> x: myList){
            x1 = x.get(0);
            x2 = x.get(1);
            System.out.println(distance(x1,x2));
        }
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(myList.get(0));
    }

}
