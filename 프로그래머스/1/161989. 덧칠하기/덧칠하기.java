class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = 0;
        
        for (int i = 1; i < section.length; i++) {
			if(section[i] - section[start] >= m ) {
				answer++;
				start = i;
			} 
		}
        return answer;
    }
}
