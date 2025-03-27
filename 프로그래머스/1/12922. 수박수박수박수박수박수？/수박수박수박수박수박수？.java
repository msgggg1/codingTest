// 내 풀이
class Solution {
    public String solution(int n) {
        String answer = "";
        
        if (n%2==0) answer = "수박".repeat(n/2);
		 else answer = "수박".repeat(n/2)+"수";
        
        return answer;
    }
}

/*
class Solution {
    public String solution(int n) {
        String answer = "";
        										if) 5 -> 수박수박수박 -> substring(0,5)
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
*/