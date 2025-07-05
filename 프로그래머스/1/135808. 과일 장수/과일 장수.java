import java.util.Arrays;

// 내 풀이
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        for (int i = score.length; i >= 0; i -= m) {
        	if (i >= m ) {
        		answer += score[i-m] * m ;
			} else { return answer; }
		}  
        return answer;
    }
}


/* sort() 쓰지 않는 더 효율적인 방법
class Solution {
    public int solution(int k, int m, int[] score) {
        int[] sc2 = new int[k+1];
        for(int i=0; i<score.length; i++) sc2[score[i]]++; 
        int sum=0, mod=0;
        for(int i=k; i>0; i--){         
            sc2[i]=sc2[i] + mod;       
            sum += sc2[i]/m * m * i;    
            mod = sc2[i]%m;             
        }
        return sum;
    }
}
*/
