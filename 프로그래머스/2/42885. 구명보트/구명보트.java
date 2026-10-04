import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int end = people.length - 1;
        int front = 0;
        Arrays.sort(people);
        for(int i = people.length - 1 ; i >= 0 ; i--){
            if(limit - people[i]  >= people [front]){
                end -= 1 ;
                front += 1;
                answer ++ ;
            } else {
                answer++;
                end -= 1;
            }
             if(end < front){
                    return answer;
                }
        }
        
        return answer;
    }
}