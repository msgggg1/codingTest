import java.util.Stack;

class Solution {
    boolean solution(String s) {
    	
        String [] strS = s.split("");
        Stack<String> st = new Stack<>();
        for(String string : strS){
            if(string.equals("(")){
                st.add(string);
            } else {
                if(!st.empty()){
                    st.pop();
                } else{
                    return false;
                }
            }
        } // for
        
        if(st.empty()){
           return true; 
        } else{
            return false;
        }
        
    }
}