class Solution {
    public int solution(int[] dot) {
        
        int[] dots = new int[2];
        dots = dot;
        
        int answer = 0;
        
        if(dots[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if(dots[0] < 0 && dots[1] > 0) {
            answer = 2;
        } else if(dots[0] < 0 && dots[1] < 0) {
            answer = 3;
        } else if (dots[0] > 0 && dots[1] < 0) {
            answer = 4;
        }
        
        return answer;
    }
}