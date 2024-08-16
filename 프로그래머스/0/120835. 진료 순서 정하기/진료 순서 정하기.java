class Solution {
    public int[] solution(int[] emer) {
        int[] answer = new int[emer.length];
        int max = 0;
        int index = 0;
        int count = 1; // 2, 3, 4
        while(true){
            if(count > emer.length) break; // 4 > 3
            for(int i = 0; i < emer.length; i++){
                if(emer[i] > max){
                    max = emer[i]; // 76, 24, 3
                    index = i; // 1, 2, 0
                }   
            }
            answer[index] = count++; // [0,1,0], [0,1,2], [3,1,2]
            emer[index] = 0; // [3,0,24], [3,0,0], [0,0,0]
            max = 0; index = 0; 
            //count++;
        }
        
        return answer;
    }
}