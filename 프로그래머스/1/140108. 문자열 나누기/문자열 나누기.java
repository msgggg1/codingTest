// 내 코드
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

// 다른 풀이
/*
class Solution { 
    public int solution(String s) { 
        int answer = 0; 
        int cnt = 0; 
        char x = 0; 
        
        for (int i = 0; i < s.length(); i++) { 
            char c = s.charAt(i); 
            if (cnt == 0) { 
                x = c; cnt = 1; 
            } else { 
                cnt += (c == x) ? 1 : -1; 
            } if (cnt == 0) { 
                answer++; 
            } 
        } 
        if (cnt > 0) answer++;
        return answer; 
    } 
}
*/
