/*
class Solution {
    public long solution(long n) {
        	if (Math.pow((int)Math.sqrt(n), 2) == n) { // (int) cast로 인해 자동 버림
				return (long)Math.pow(Math.sqrt(n)+1, 2); // Math.pow double return/long answer 리턴이므로 cast
			}
			return -1;
    }
}
*/
/*
class Solution {
	public long solution(long n) {
		double i = Math.sqrt(n); // double return
		return Math.floor(i) == i ? (long)Math.pow(i+1, 2) : -1 ; // double -> long cast
	}
}
*/

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
