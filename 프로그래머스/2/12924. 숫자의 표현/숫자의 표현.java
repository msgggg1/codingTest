// class Solution {
//     public int solution(int n) {
//         int answer = 0;
        
//         // n(n+1)/2 - m(m+1)/2
//         for(int i = n ; i >= 1 ; i--){
//             for(int j = 0 ; j<i ; j++){
//                 int sum = i*(i+1)/2 - j*(j+1)/2;
//                 if(sum == n){
//                     answer++;
//                 }
                    
//             }
//         }
        
//         return answer;
//     }
// }


class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n의 약수 중 홀수인 것의 개수 구하기
        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}