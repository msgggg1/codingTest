import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

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