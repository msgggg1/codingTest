import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : arr) if (i%divisor==0) al.add(i);
        if (al.size() == 0) al.add(-1);
         answer = al.stream().mapToInt(Integer::intValue).sorted().toArray();
        		 
        
        return answer;
    }
}
