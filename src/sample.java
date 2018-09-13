import java.util.ArrayList;
import java.util.*;
public class sample {
    public static List<List<Integer>> optimalUtilization(int deviceCapacity, List<List<Integer>> foregroundAppList, List<List<Integer>> backgroundAppList)
    {

        List<List<Integer>> out = new ArrayList<List<Integer>>();
        List<List<Integer>> out1 = new ArrayList<List<Integer>>();
        Map<Integer,Integer> k= new HashMap<Integer,Integer>();

        int max = 0;

        for(int i=0;i<foregroundAppList.size();i++) {
            for(int j=0;j<backgroundAppList.size();j++) {
                if(foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1) <= deviceCapacity && foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1) > max) {
                    max = foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1);
                    out1.clear();
                    List<Integer> index2 = new ArrayList<Integer>();
                    index2.add(foregroundAppList.get(i).get(0));
                    index2.add(backgroundAppList.get(j).get(0));
                    out1.add(index2);
                }else if(foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1) <= deviceCapacity && foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1) == max){
                    List<Integer> index2 = new ArrayList<Integer>();
                    index2.add(foregroundAppList.get(i).get(0));
                    index2.add(backgroundAppList.get(j).get(0));
                    out1.add(index2);
                }
            }
        }

        System.out.println(max);
        System.out.println(out1);

        for(int i=0;i<foregroundAppList.size();i++) {
            for(int j=0;j<backgroundAppList.size();j++) {
                if(foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1) == max) {
                    List<Integer> index = new ArrayList<Integer>();
                    index.add(foregroundAppList.get(i).get(0));
                    index.add(backgroundAppList.get(j).get(0));
                    out.add(index);
                }
            }
        }

        System.out.println(out);
        return out;
    }
    public static void main(String[] args) {


        List<List<Integer>> foregroundAppList = new ArrayList<List<Integer>>();
        List<List<Integer>> backgroundAppList = new ArrayList<List<Integer>>();
        List<Integer> foregroundApp1 = new ArrayList<Integer>();
        List<Integer> foregroundApp2 = new ArrayList<Integer>();
        List<Integer> foregroundApp3 = new ArrayList<Integer>();
        List<Integer> backgroundApp1 = new ArrayList<Integer>();
        List<Integer> backgroundApp2 = new ArrayList<Integer>();
        List<Integer> backgroundApp3 = new ArrayList<Integer>();
        foregroundApp1.add(1);
        foregroundApp1.add(3);
        foregroundApp2.add(2);
        foregroundApp2.add(2);
        foregroundApp3.add(3);
        foregroundApp3.add(6);
        backgroundApp1.add(7);
        backgroundApp1.add(5);
        backgroundApp2.add(3);
        backgroundApp2.add(5);
        backgroundApp3.add(5);
        backgroundApp3.add(8);
        foregroundAppList.add(foregroundApp1);
        foregroundAppList.add(foregroundApp2);
        foregroundAppList.add(foregroundApp3);
        backgroundAppList.add(backgroundApp1);
        backgroundAppList.add(backgroundApp2);
        backgroundAppList.add(backgroundApp3);
        optimalUtilization(11, foregroundAppList, backgroundAppList);

    }
}