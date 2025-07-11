class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];
  
        for (int i = 0; i < photo.length; i++) {
        	int sum = 0;
			for (int j = 0; j < photo[i].length; j++) {
				for (int k = 0; k < name.length; k++) {
 					if(name[k].equals(photo[i][j])) sum += yearning[k];
				}
			}
			answer[i] = sum;
		}
        return answer;
    }
}
/*
class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int [photo.length];
		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		
		for (int i = 0; i < photo.length; i++) {
			String [] persons = photo[i];
			int score = 0;
			for (int j = 0; j < persons.length; j++) {
				String person = persons[j];
				if (map.containsKey(person)) {
					score += map.get(person);
				}
			}
			answer[i] = score;
		}
		
		return answer;
	}
}*/