import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.length()%2 != 0) return 0 ;
        
        for(int i = 0 ; i < s.length() ; i++){
            String s1 = s.substring(i) + s.substring(0,i);
            if(isValid(s1)){
                answer ++;
            }
        }
    
        
        return answer;
    }
    
    
    boolean isValid(String str ){
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : str.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            } else{
                if(stack.isEmpty()) return false;    
                
                char top = stack.peek();
                if(c==')' && top == '(' || 
                   c==']' && top == '['|| 
                   c=='}' && top == '{'){
                   stack.pop();
                }else{
                    return false;
                }
            }
            
               
        }
        
        return stack.isEmpty();
    }
}