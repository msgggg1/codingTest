import java.util.Arrays;
// 내 풀이
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        int total = stages.length;
        double [] stageArr = new double [N+1];
        for (int i = 0; i < total; i++) {
			stageArr[stages[i]-1]++;
		} 

        for (int i = 0; i < N; i++) {
        	int rememTotal = total;
        	total -= stageArr[i]; 
        	stageArr[i] /= rememTotal;        		
		}
        
       
        for (int i = 0; i < N; i++) {
        	double max = -1;
        	int stage = i;
        	for (int j = 0; j < N; j++) {
				if (max < stageArr[j]) {
					max = stageArr[j];
					stage = j;
				}
			}
        	answer[i] = stage+1;
        	stageArr[stage]= -1;
		}
    
        return answer;
    }
}
// 학습용 다른 사람 풀이
/*
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int totalPlayers = stages.length;
        int[] answer = new int[N];
        int[] stageCount = new int[N + 1]; // 각 스테이지에 머문 플레이어 수

        // 각 스테이지에 머문 플레이어 수 카운트
        for (int s : stages) {
            if (s <= N) stageCount[s]++;
        }

        // Stage 객체 리스트에 실패율 계산
        List<Stage> stageList = new ArrayList<>();
        int remainingPlayers = totalPlayers; // 아직 도전 중인 플레이어 수
        for (int i = 1; i <= N; i++) {
            double failure = (remainingPlayers == 0) ? 0 : (double) stageCount[i] / remainingPlayers;
            remainingPlayers -= stageCount[i];
            stageList.add(new Stage(i, failure));
        }

        // 실패율 내림차순, 동률 시 스테이지 번호 오름차순 정렬
        Collections.sort(stageList);

        // 정답 배열에 스테이지 번호만 담기
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).id;
        }

        return answer;
    }

    // Stage 객체: 스테이지 번호와 실패율 저장, Comparable 구현
    static class Stage implements Comparable<Stage> {
        int id;
        double failure;

        Stage(int id, double failure) {
            this.id = id;
            this.failure = failure;
        }

        @Override
        public int compareTo(Stage o) {
            // 실패율 내림차순
            if (this.failure < o.failure) return 1;
            if (this.failure > o.failure) return -1;
            // 실패율 같으면 스테이지 번호 오름차순
            return Integer.compare(this.id, o.id);
        }
    }
}
*/