// 내 풀이
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        answer[1] = 1;
        int a = Math.min(n, m);
        int b = Math.max(n, m);
        int x = a;
        int y = b;
        
        for (int i = 1; i <= a; i++) {
			if (a%i==0 && b%i==0) {
				answer[0]=i;
			}
		}
        
        for (int i = 2; i <= y; i++) {
        	while (x%i == 0 && y%i==0) {
				answer[1] *= i;
				x /= i;
				y /= i;
			}
		}
        answer[1] = answer[1]*x*y;
        
        
        
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        answer[1] = 1;
        int a = Math.min(n, m);
        int b = Math.max(n, m);
        
        for (int i = 1; i <= a; i++) {
			if (a%i==0 && b%i==0) {
				answer[0]=i;
                answer[1]= a*b /i;
			}
		}
        
        return answer;
    }
}
*/
/*
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        answer[1] = 1;
        int a = Math.min(n, m);
        int b = Math.max(n, m);
        
        for (int i = 1; i <= a; i++) {
			if (a%i==0 && b%i==0) {
				answer[0]=i;
			}
		}
        
        for (int i = m*n; i >=Math.min(m, n); i--) {
        	if(i%a == 0 && i%b==0) {
				answer[1] = i;
			}
		}
        
        
        return answer;
    }
}
*/
