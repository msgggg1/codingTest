class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				for (int j2 = 0; j2 < number.length; j2++) {
					if (i!=j&&i!=j2&&j!=j2) {
						if (number[i]+number[j]+number[j2]==0) {
							answer++;
						}
					}
				}
			}
		} 
        return answer/6;
    }
}