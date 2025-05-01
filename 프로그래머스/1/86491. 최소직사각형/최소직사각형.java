import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

// 내 풀이
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
// class Solution {
// 	public int solution(int[][] sizes) {
// 		int answer = 0;
// 		int length = 0, height = 0;
	
// 		for (int[] size : sizes) {
// 			length = Math.max(length, Math.max(size[0], size[1]));
// 			height = Math.max(height, Math.min(size[0], size[1]));
// 		}
		
// 		return length*height;
// 	}
// }
// class Solution {
// 	public int solution(int[][] sizes) {
		
// 		return Arrays.stream(sizes).reduce((a, b)-> new int [] {
// 				 Math.max(Math.max(b[0], b[1]), Math.max(a[0], a[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))})
// 				.map(size->size[0]*size[1]).get();
		
// 	}
// }