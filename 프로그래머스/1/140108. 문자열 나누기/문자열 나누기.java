class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 0;
        
        while (idx != s.length()) {
        	if (idx == s.length()-1) {
				answer ++;
				return answer;
			}
        	if (s.charAt(idx) != s.charAt(idx+1)) {
        		answer ++;
        		idx += 2;
        	} else {
        		int xcnt = 0;
        		int ocnt = 0;
        		for (int i = idx; i < s.length(); i++) {
        			char x = s.charAt(idx);
					if (s.charAt(i) == x) {
						xcnt++;
					}else {
						ocnt++;
					}
					if (xcnt == ocnt) {
						idx = i+1;
						answer ++;
						break;
					}
					if (i == s.length() - 1) { 
	                    answer++;
	                    idx = s.length(); 
	                }
				}
        	}
			
		}
        
        return answer;
    }
}

