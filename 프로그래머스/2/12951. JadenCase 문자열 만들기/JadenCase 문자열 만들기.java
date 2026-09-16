class Solution{
    public String solution(String s){
        StringBuilder answer = new StringBuilder();
        boolean candidate = true;
        
        for (char c : s.toCharArray()){
            if(c == ' '){
                candidate = true;
                answer.append(c);
            }else{
                if(candidate){
                    answer.append(Character.toUpperCase(c));
                    candidate = false;
                }else{
                    answer.append(Character.toLowerCase(c));
                }
            }
                
        }
        
        return answer.toString();
    }
}