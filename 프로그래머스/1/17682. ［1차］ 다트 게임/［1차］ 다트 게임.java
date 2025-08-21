import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
	public int solution(String dartResult) {
		int answer = 0;

		Pattern pattern = Pattern.compile("(\\d{1,2})([SDT])([*#]?)");
		Matcher matcher = pattern.matcher(dartResult);

		int [] scoreHx = new int [3];
		int idx = 0;
		
		while (matcher.find()) {

			int score = Integer.parseInt(matcher.group(1));
			int rscore = 0;
			String region = matcher.group(2);
			String option = matcher.group(3);

			switch (region) {
			case "S":
				rscore = score;
				break;
			case "D":
				rscore = score * score;
				break;
			case "T":
				rscore = score *score *score;
				break;
			}

			scoreHx[idx] = rscore;

			if (option.equals("*")) {
					scoreHx[idx] *= 2;		
					if (idx != 0) {
						scoreHx[idx-1] *= 2;
					}
				} else if (option.equals("#")) {
					scoreHx[idx] *= -1;
				} 
			
			idx++;
		}
		
		for (int j = 0; j < scoreHx.length; j++) {
			answer += scoreHx[j];
		}

		return answer;
	}
}

// stack 이용하기