//내 풀이
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for (int i = 0; i < b.length; i++) {
			answer += a[i]*b[i];
		}
        return answer;
    }
}

/*
class Solution {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		//			index:0~a.length 흘려보냄, 임시저장            										저장
		return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
	}
}
*/

