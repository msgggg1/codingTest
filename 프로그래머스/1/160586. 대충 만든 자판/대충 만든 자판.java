class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        
        for (int i = 0; i < targets.length; i++) {
        	String target = targets[i];
			for (int j = 0; j < target.length(); j++) {
				char c = target.charAt(j);
				int Depth = 101 ;
				for (int k = 0; k < keymap.length; k++) {
					int tempDepth = keymap[k].indexOf(c);
					if (tempDepth != -1 && tempDepth < Depth) {
						Depth = tempDepth;
					}
					
				}
				if(Depth == 101) {
					answer[i] = -1;
					break;
				}
				answer[i] += Depth + 1 ;
			}
		}
        
        return answer;
    }
}
