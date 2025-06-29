class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
			String answerStr = Integer.toBinaryString(arr1[i]|arr2[i]);
			if (answerStr.length() < n) {
				answerStr = "0".repeat(n-answerStr.length()) + answerStr;
			}
			answerStr = answerStr.replaceAll("0", " "). replaceAll("1", "#");
			answer[i] = answerStr;
		}
        
        return answer;
    }
}