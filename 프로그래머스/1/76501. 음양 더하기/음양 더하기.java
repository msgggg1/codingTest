class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0 ;
        for (int i = 0; i < signs.length; i++) {
			if (signs[i]==true) answer += absolutes[i];  
				else answer -= absolutes[i]	;
            //answer += absolutes[i] * (signs[i]? 1: -1);
		}
        
        return answer;
    }
}