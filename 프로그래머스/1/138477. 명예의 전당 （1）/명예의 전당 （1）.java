import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        int [] rank = new int [k];
        
        for (int i = 0; i < score.length; i++) {
        	int [] temp = Arrays.copyOf(score, i+1);
        	Arrays.sort(temp);
        	int length = temp.length;
        	int [] rTemp ;
        	if (i<k) {
        		answer[i] = temp[0]; 
			}else {
				rTemp =Arrays.copyOfRange(temp, length-k, length-1);
				answer[i] = rTemp[0];
			}       	
		} 
        return answer;
    }
}