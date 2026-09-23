import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> baskets = new HashMap<>();
        
        for(int size : tangerine ){
            baskets.put(size, baskets.getOrDefault(size,0)+1);
        }
        
        List<Integer> counts = new ArrayList(baskets.values());
        
        counts.sort(Collections.reverseOrder());
        
        for(int count : counts){
            k -= count;
            answer++;
            
            if(k <= 0) return answer; 
        }
            
        return answer;
    }
}