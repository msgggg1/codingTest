import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] kijun = {"code", "date", "maximum", "remain"};
        int k = -1, s = -1;
        
        for (int i = 0; i < kijun.length; i++) {
            if (kijun[i].equals(ext)) k = i;
            if (kijun[i].equals(sort_by)) s = i;
        }
        
        int count = 0;
        for (int[] row : data) {
            if (row[k] < val_ext) count++;
        }
        
        int[][] answer = new int[count][4];
        int idx = 0;
        for (int[] row : data) {
            if (row[k] < val_ext) answer[idx++] = row;
        }
        
        final int sortIndex = s;
        Arrays.sort(answer, (a, b) -> Integer.compare(a[sortIndex], b[sortIndex]));
        
        return answer;
    }
}