import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr); // 정렬하여 가장 큰 수를 맨 뒤로 보냄
        int max = arr[arr.length - 1]; // 가장 큰 수
        int candidate = max; // 최소공배수 후보

        while (true) {
            boolean isLcm = true;

            // 후보 숫자가 배열의 모든 수로 나누어떨어지는지 확인
            for (int num : arr) {
                if (candidate % num != 0) {
                    isLcm = false; // 하나라도 안 나누어떨어지면 탈락
                    break;
                }
            }

            // 모든 수로 나누어떨어지면 그 값이 바로 최소공배수!
            if (isLcm) {
                return candidate;
            }

            // 안 된다면 가장 큰 수만큼 더해서 다음 배수로 테스트 (max * 1 -> max * 2 -> max * 3 ...)
            candidate += max;
        }
    }
}