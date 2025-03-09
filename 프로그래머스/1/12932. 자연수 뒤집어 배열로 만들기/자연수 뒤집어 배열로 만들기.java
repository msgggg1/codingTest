class Solution {
    public int[] solution(long n) {
    	String strN = String.valueOf(n);
    	int leng = strN.length();
        int[] answer = new int [leng];
        
        for (int i = 0; i < leng; i++) {
        	answer[i] = strN.charAt(leng-1-i)-'0';
		}
        
        return answer;
    }
}