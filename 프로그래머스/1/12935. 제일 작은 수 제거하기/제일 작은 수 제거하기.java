import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//[내 풀이]
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
/*
class Solution {
    public int[] solution(int[] arr) {
    	
        if (arr.length <= 1) return new int []{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i->i!=min).toArray();
    }
}
*/
/*
class Solution {
    public int[] solution(int[] arr) {
    	
    	int index = 0;
    	
    	if (arr.length <= 1) return new int [] {-1};
    	
    	for (int i = 1; i < arr.length; i++) {
    		if (arr[index] >= arr[i])index = i;
    	}

    	int [] answer = new int [arr.length-1];
    	
    	for (int i = 0; i < index; i++) answer[i] = arr[i];
    	for (int i = index+1; i < arr.length; i++) answer[i-1] = arr[i];
		
    	return answer;
    }
}
*/