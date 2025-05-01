class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max, min;
        max = sizes[0][0] >= sizes[0][1] ? sizes[0][0]:sizes[0][1];
        min = sizes[0][0] >= sizes[0][1] ? sizes[0][1]:sizes[0][0];
        for (int i = 1; i < sizes.length; i++) {
				int tempMax, tempMin;
				tempMax = sizes[i][0] >= sizes[i][1] ? sizes[i][0]:sizes[i][1];
				tempMin = sizes[i][0] >= sizes[i][1] ? sizes[i][1]:sizes[i][0];
		
				max = max >= tempMax? max : tempMax;
				min = min >= tempMin? min : tempMin;
		}
        return min*max;
    }
}