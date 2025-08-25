class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        
        int score = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
			int t = lottos[i];
			if (t == 0) {
				zero ++;
			}else {
				for (int j = 0; j < win_nums.length; j++) {
					if (t == win_nums[j]) {
						score ++;
					}
				} 
			}
		}
        
        int [] rank = {6,6,5,4,3,2,1};
        answer[0] = rank[score+zero] ;
        answer[1] = rank[score];
        return answer;
    }
}