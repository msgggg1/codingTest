class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);

            if (sb.length() >= 4 &&
                sb.substring(sb.length()-4).equals("1231")) {
                    sb.delete(sb.length()-4, sb.length());
                    answer++;
            }
        }
       
        return answer;
    }
}


// stack 사용
/*
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);

            // 스택 크기가 4 이상이면 마지막 4개 확인
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size-4) == 1 &&
                    stack.get(size-3) == 2 &&
                    stack.get(size-2) == 3 &&
                    stack.get(size-1) == 1) {
                    
                    // 햄버거 완성 → 마지막 4개 제거
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }

        return answer;
    }
}
*/