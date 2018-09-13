import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution{

    public int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {
        int[][] areaA = new int[numRows][numColumns];
        for (int i = 0; i < area.size(); i++) {
            int j = 0;
            for (Integer x : area.get(i)) {
                areaA[i][j] = x;
                j++;
            }
        }
        int[] start = {0,0};
        int[] dest = new int[2];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (areaA[i][j] == 9) {
                    dest[0] = i;
                    dest[1] = j;
                }
            }
        }

        for(int x: dest){
            System.out.println(x);
        }

        int[][] distance = new int[areaA.length][areaA[0].length];
        for (int[] row: distance)
            Arrays.fill(row, Integer.MAX_VALUE);
        distance[start[0]][start[1]] = 0;
        dfs(areaA, start, distance);
        for(int i = 0; i< distance.length; i++){
            for(int j = 0; j < distance[0].length; j++){
                System.out.println(distance[i][j]);
            }
        }
        return distance[dest[0]][dest[1]] == Integer.MAX_VALUE ? -1 : distance[dest[0]][dest[1]];
    }

    public void dfs(int[][] maze, int[] start, int[][] distance) {
        int[][] dirs={{0,1}, {0,-1}, {-1,0}, {1,0}};
        for (int[] dir: dirs) {
            int x = start[0] + dir[0];
            int y = start[1] + dir[1];
            int count = 0;
            while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 1) {
                x += dir[0];
                y += dir[1];
                count++;
            }
            if (distance[start[0]][start[1]] + count < distance[x - dir[0]][y - dir[1]]) {
                distance[x - dir[0]][y - dir[1]] = distance[start[0]][start[1]] + count;
                dfs(maze, new int[]{x - dir[0],y - dir[1]}, distance);
            }
        }
    }
//
//    public void dfs(int[][] maze, int[] start, int[][] distance) {
//        int[][] dirs={{0,1}, {0,-1}, {-1,0}, {1,0}};
//        for (int[] dir: dirs) {
//            int x = start[0] + dir[0];
//            int y = start[1] + dir[1];
//            int count = 0;
//            while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 0) {
//                x += dir[0];
//                y += dir[1];
//                count++;
//            }
//            if (distance[start[0]][start[1]] + count < distance[x - dir[0]][y - dir[1]]) {
//                distance[x - dir[0]][y - dir[1]] = distance[start[0]][start[1]] + count;
//                dfs(maze, new int[]{x - dir[0],y - dir[1]}, distance);
//            }
//        }
//    }

    public static void main(String[] args) {
        List<List<Integer>> area = new ArrayList<List<Integer>>();
        List<Integer> area1 = new ArrayList<Integer>();
        List<Integer> area2 = new ArrayList<Integer>();
        List<Integer> area3 = new ArrayList<Integer>();
        area1.add(1);
        area1.add(0);
        area1.add(0);
        area2.add(1);
        area2.add(0);
        area2.add(0);
        area3.add(1);
        area3.add(9);
        area3.add(1);
        area.add(area1);
        area.add(area2);
        area.add(area3);
        Solution s = new Solution();
        System.out.println(s.minimumDistance(3,3,area));

    }
}