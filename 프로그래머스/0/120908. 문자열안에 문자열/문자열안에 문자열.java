class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        boolean bool = str1.contains(str2);
        
        if(bool == true) {
            answer = 1;
        } else if(bool == false) {
            answer = 2;
        }
        
        return answer;
    }
}