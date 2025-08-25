// 내 풀이
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int hlength = board.length -1;
        int wwidth = board[h].length -1;
        if (h > 0 && board[h-1][w].equals(color)) {
        		answer++;		
		}
        if (w > 0 && board[h][w-1].equals(color)) {
        	answer++;		
		}
        if (w < wwidth && board[h][w+1].equals(color)) {
        	answer++;			
		}
        if (h < hlength && board[h+1][w].equals(color)) {
        	answer++;		
		}
               		
        return answer;
    }
}


/*
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int[][] directions = {
            {-1, 0}, 
            {1, 0},  
            {0, -1}, 
            {0, 1}  
        };

        for (int[] dir : directions) {
            int nh = h + dir[0];
            int nw = w + dir[1];

            if (nh >= 0 && nh < board.length && nw >= 0 && nw < board[0].length) {
                if (board[nh][nw].equals(color)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
*/