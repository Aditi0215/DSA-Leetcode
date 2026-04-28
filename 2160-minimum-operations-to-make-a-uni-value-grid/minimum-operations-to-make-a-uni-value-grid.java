import java.util.*;

class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();

        for(int[] row : grid){
            for(int num : row){
                list.add(num);
            }
        }

        int base = list.get(0);

        // check feasibility
        for(int num : list){
            if((num - base) % x != 0){
                return -1;
            }
        }

        // sort and find median
        Collections.sort(list);
        int median = list.get(list.size() / 2);

        int ops = 0;
        for(int num : list){
            ops += Math.abs(num - median) / x;
        }

        return ops;
    }
}