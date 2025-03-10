class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        
        if (max == min) answer = a;
        else {
        	for (; min <= max; min++) {
				answer += min;
			}
        	
		}
        return answer;
    }
}