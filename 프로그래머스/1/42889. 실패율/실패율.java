import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        int total = stages.length;
        double [] stageArr = new double [N+1];
        for (int i = 0; i < total; i++) {
			stageArr[stages[i]-1]++;
		} 

        for (int i = 0; i < N; i++) {
        	int rememTotal = total;
        	total -= stageArr[i]; 
        	stageArr[i] /= rememTotal;        		
		}
        
       
        for (int i = 0; i < N; i++) {
        	double max = -1;
        	int stage = i;
        	for (int j = 0; j < N; j++) {
				if (max < stageArr[j]) {
					max = stageArr[j];
					stage = j;
				}
			}
        	answer[i] = stage+1;
        	stageArr[stage]= -1;
		}
    
        return answer;
    }
}
