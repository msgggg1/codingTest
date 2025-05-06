import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 내 풀이
class Solution {
   public int[] solution(int[] numbers) {
       ArrayList<Integer> al = new ArrayList<Integer>();
       for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(!al.contains(numbers[i]+numbers[j])) al.add(numbers[i]+numbers[j]);
			}
		}
       al.sort(null);
       int [] answer = new int [al.size()];
       Iterator<Integer> ir = al.iterator();
       int i = 0;
       while (ir.hasNext()) {
			Integer e = (Integer) ir.next();
			answer[i++] = e;
		}
       return answer;
   }
}

// class Solution {
// 	public int[] solution(int[] numbers) {
		
// 		Set<Integer> set = new HashSet<Integer>();
		
// 		for (int i = 0; i < numbers.length; i++) {
// 			for (int j = i+1; j < numbers.length; j++) {
// 				set.add(numbers[i]+numbers[j]);
// 			}
// 		}
		
// 		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
// 	}
// }
// class Solution {
//    public ArrayList<Integer> solution(int[] numbers) {
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        Set<Integer> set = new HashSet<Integer>();
//        for (int i = 0; i < numbers.length; i++) {
// 			for (int j = i+1; j < numbers.length; j++) {
// 				set.add(numbers[i]+numbers[j]);
// 			}
// 		}
       
//        Iterator<Integer> ir = set.iterator();
//       while (ir.hasNext()) {
// 		al.add( ir.next() );
// 	}
      
//      Collections.sort(al);
//      return al;
//    }
// }