class Solution {
	public int solution(int number, int limit, int power) {
		int answer = 0;

		for (int i = 1; i <= number; i++) {
			int d = 0;
				for (int j = 1 ; j*j <= i; j++) {
					if (i%j == 0 ) d += j*j == i ?  1 : 2 ;
					if (d > limit) {
							d = power;
							break;
						}			
					}
				answer += d;
				}
		return answer;
	}
}