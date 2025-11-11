class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int count = 0;
        
        for(int number : numbers) {
            answer += (double)number;
            count++;
        }
        
        answer = answer/count;
        
        return answer;
    }
}