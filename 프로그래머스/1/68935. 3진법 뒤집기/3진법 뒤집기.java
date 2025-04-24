class Solution {
    public int solution(int n) {
        int answer = 0;
        String strAnswer = "";
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
        	sb.append(n%3);
			n /= 3;
		} // while
        
        for (int i = sb.length()-1; i >= 0; i--) {
			answer += (((int)(sb.charAt(i))-'0')*(Math.pow(3, sb.length()-i-1)));
		} // for
       
        
        return answer;
    }
}
