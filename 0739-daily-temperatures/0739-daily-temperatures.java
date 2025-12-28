class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] array = new int[temperatures.length];
        
        for(int i = 0; i< temperatures.length; i++){
    while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
        int indx = stack.pop();
        array[indx] = i - indx;
    }
    stack.push(i);
        }
     
        return array;
    }
}