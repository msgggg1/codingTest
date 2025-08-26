import java.util.HashMap;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            hm.put(i, 1);
        }

        for (int i : reserve) {
            hm.put(i, hm.get(i) + 1); // 1 + 1 = 2
        }

        for (int i : lost) {
            hm.put(i, hm.get(i) - 1); // 1 or 2 - 1
        }

        for (int i = 1; i <= n; i++) {
            if (hm.get(i) == 0) {
                if (hm.get(i - 1) != null && hm.get(i - 1) == 2) {
                    hm.put(i - 1, 1);
                    hm.put(i, 1);
                } else if (hm.get(i + 1) != null && hm.get(i + 1) == 2) {
                    hm.put(i + 1, 1);
                    hm.put(i, 1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (hm.get(i) >= 1) {
                answer++;
            }
        }

        return answer;
    }
}
