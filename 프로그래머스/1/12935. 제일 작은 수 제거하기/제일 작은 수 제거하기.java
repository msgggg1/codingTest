import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
    	
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        if (list.size() != 1) {
        	 list.remove(Collections.min(list));
             
		} else {
			list.set(0, -1);
		}
        
        int [] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}