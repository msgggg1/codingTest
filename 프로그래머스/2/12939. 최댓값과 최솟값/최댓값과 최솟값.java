import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        String [] ss = s.split(" ");
        int [] is = Arrays.stream(ss).mapToInt(i -> Integer.valueOf(i)).toArray();
        
        int min = is[0];
        int max = is[0];
        for(int j = 0 ; j < is.length; j++){
            if(min>is[j]){
                min = is[j];
            }
            if(max<is[j]){
                max = is[j];
            }
        }
        
        
        return min + " " + max;
    }
}