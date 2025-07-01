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
/* 다른 사람 풀이
class Solution {

    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];    
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}
*/