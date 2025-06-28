import java.util.Arrays;

// 내 풀이
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

/*
class Solution {
    public int[] solution(int k, int[] score) {
    	int [] answer = new int [score.length];
    	
    	PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
    	
    	for (int i = 0; i < score.length; i++) {
			priorityQueue.add(score[i]);
			if (priorityQueue.size() > k) {
				priorityQueue.poll();
			}
			answer[i] = priorityQueue.peek();
		}
    	
		return answer;
        
    }
}
*/
/*
class Solution {
    public int[] solution(int k, int[] score) {
    	Integer [] scores = new Integer[score.length];
    	
    	return IntStream.range(0, score.length)
    			.peek(i -> scores[i]=score[i])
    			.map(i -> {
    				Arrays.sort(scores,0,i, Collections.reverseOrder(Integer::compare));
    				return i<k ? score[i] : score[k-1];
    			})
    			.toArray();     
    }
}
*/