import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Stack;

// 내 풀이
class Solution {
	public int[] solution(int []arr) {

			int cnt = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				arr[i] = -1;
				cnt ++;
			}
		}
			int [] answer = new int [arr.length-cnt];
			int idx = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != -1) answer[idx++] = arr[j]; 
			}
        return answer;
	}
}

/* ArrayList 풀이
class Solution {
	public int[] solution(int []arr) {

		ArrayList<Integer> al = new ArrayList<>();
		int preNum = 10 ;
		for (int num : arr) {
			if (preNum != num) {
				al.add(num);
				preNum = num;
			}
		}
		
		int [] answer = new int [al.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = al.get(i).intValue();
		}
		return answer;
	}
}
*/
/* Stack 풀이
class Solution {
	public Stack solution(int []arr) {

		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (s.size()==0 || s.peek() != arr[i]) 
				s.push(arr[i]);
		}
		return s;
	}
}
*/