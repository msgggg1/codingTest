import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> sumSet = new HashSet<>();
        
        for(int len = 1 ; len <= elements.length ; len++ ){
            
            // 시작 위치
            for(int i = 0 ; i < elements.length ; i++){
                int sum = 0;
                
                // 더하기
                for(int j = 0 ; j < len ; j++){
                    sum += elements[(i+j)%elements.length];
                }
                sumSet.add(sum);
            }
            
        }
        
        return sumSet.size();
    }
}