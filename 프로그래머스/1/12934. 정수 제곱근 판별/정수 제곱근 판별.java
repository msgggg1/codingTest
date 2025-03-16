class Solution {
    public long solution(long n) {
        long answer = 0 ;
        
        for (long i = 1; i <= Math.sqrt(n); i++) {
        	if (Math.sqrt(n)==i){
				answer = (i+1)*(i+1);
				break;
			}
			else answer = -1;
		}
		return answer;
    }
}