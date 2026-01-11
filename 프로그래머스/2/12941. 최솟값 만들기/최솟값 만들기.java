import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // A정렬
        Arrays.sort(A);
        
        // B정렬
        Arrays.sort(B);
        
        // answer구하기
        for(int i = 0 ; i < A.length ; i++){
            answer += A[i]*B[A.length -1 -i];
        }
        return answer;
    }
}