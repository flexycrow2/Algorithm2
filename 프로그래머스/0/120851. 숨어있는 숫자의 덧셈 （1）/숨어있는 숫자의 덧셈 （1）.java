class Solution {
    public int solution(String my_string) {
        String[] my_string2 = my_string.split("");
        String[] numbers = {"1","2","3","4","5","6","7","8","9"};
        int[] intNumbers = {1,2,3,4,5,6,7,8,9};
        int answer = 0;
        for(int i = 0; i < my_string2.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(my_string2[i].equals(numbers[j])){
                    answer += intNumbers[j];
                }
            }
        }
        return answer;
    }
}