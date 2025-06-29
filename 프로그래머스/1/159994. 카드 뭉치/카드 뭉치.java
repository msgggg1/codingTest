import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> qc1 = new LinkedList<String>();
        Queue<String> qc2 = new LinkedList<String>();
        
    	for (String c1 : cards1) {
			qc1.offer(c1);
		}
    	for (String c2 : cards2) {
			qc2.offer(c2);
		}

    	int gl = goal.length;
    	for (int i = 0 ; i < gl ; i++) {
			if (goal[i].equals(qc1.peek())) {
				qc1.poll();
			} else if(goal[i].equals(qc2.peek())) {
				qc2.poll();
			} else { return "No"; }
		}
    	
    	return "Yes";
    }
}