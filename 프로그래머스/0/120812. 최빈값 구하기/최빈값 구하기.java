class Solution {
    public int solution(int[] array) {
        int[] counts = new int[1000];
        
        for(int num : array) {
            counts[num]++;
        }
        
        int maxFrequency = 0;
        int answer = 0;
        
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] > maxFrequency) {
                maxFrequency = counts[i];
                answer = i;
            } else if(counts[i] == maxFrequency) {
                answer = -1;
            }
        }
        
        return answer;
    }
}