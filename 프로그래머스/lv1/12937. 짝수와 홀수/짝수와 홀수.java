class Solution {
    public String solution(int num) {
        String answer1 = "Even";
        String answer2 = "Odd";
        
        if(num % 2 == 0){
            return answer1;
        }else{
            return answer2;
        }            
    }
}