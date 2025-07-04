import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
    	
    	int [] s1 = {1,2,3,4,5};
    	int [] s2 = {2,1,2,3,2,4,2,5};
    	int [] s3 = {3,3,1,1,2,2,4,4,5,5};
    	int [] score = new int [3];
    	for (int i = 0; i < answers.length; i++) {
			if (s1[i % 5] == answers[i]) score[0]++;
			if (s2[i % 8] == answers[i]) score[1]++;
			if (s3[i % 10] == answers[i]) score[2]++;
		}
    	
    	int max = 0 ;
    	for (int i : score) {
			if (max <= i) {
				max = i;
			}
		}
    	
    	ArrayList<Integer> list = new ArrayList<>();
    	for (int i = 0; i < score.length; i++) {
			if (max == score[i]) {
				list.add(i);
			}
		}
    	
    	 //return list.stream().mapToInt(i->i.intValue()).toArray();
     	
        int[] answer = new int [list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i)+1;
		}
        return answer;
       
    }
}

// 다른 사람 풀이
/*
 * int[][] patterns = { {1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1,
 * 2, 2, 4, 4, 5, 5} };
 * 
 * int[] hit = new int[3]; for(int i = 0; i < hit.length; i++) { for(int j = 0;
 * j < answers.length; j++) { if(patterns[i][j % patterns[i].length] ==
 * answers[j]) hit[i]++; } }
 */
