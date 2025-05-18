class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int rest = 0;
        
        if ( a > n ) {
			return 0 ;
		} else {
			while ( n > 0 ) {
				answer += b * (n/a);
				if (n%a != 0) rest += n%a;
				n = b * (n/a) ;
				if (rest >= a ) {
					answer += b * (rest/a) ; 
					n += b * (rest/a);
					rest %= a;
				} 
			}
		}
        return answer;
    }
}