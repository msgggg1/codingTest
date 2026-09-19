// class Solution
// {
//     public int solution(String s)
//     {
//         boolean flag = true ; 
//         while(!(s.length() == 0)){
            
//             if(flag){
//               for(int i = 0; i < s.length() -1 ; i++){
//                 if(s.charAt(i) == s.charAt(i+1)){
//                     String target = s.substring(i,i+2);
//                     s = s.replaceFirst(target, "");
//                     flag = true;
//                     break;
//                 } else {flag =false;}
//                 }
//             } else {
//                 break;
//             }

            
//         }
        
//         return s.length() == 0 ? 1 : 0 ;
//     }
// }

import java.util.*;

class Solution
{
    public int solution(String s)
    {
       Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        
        return stack.isEmpty()?1:0 ;
    }
}