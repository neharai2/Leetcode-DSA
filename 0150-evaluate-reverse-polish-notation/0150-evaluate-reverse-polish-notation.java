class Solution {
    public int evalRPN(String[] tokens) {
       

        Stack<Integer> stack = new Stack<>();
        int result = 0;
       

      for(int i = 0; i< tokens.length; i++){

      if(tokens[i].equals("+") ){
           int b = stack.pop(); // second operand
            int a = stack.pop(); // first operand
            result = a + b;
            stack.push(result);

        }
        else if(tokens[i].equals("-") ){
            int b = stack.pop(); // second operand
            int a = stack.pop(); // first operand
            result = a - b;
              stack.push(result);

        }
        else if(tokens[i].equals("*") ){
           int b = stack.pop(); // second operand
            int a = stack.pop(); // first operand
            result = a * b;
              stack.push(result);

        }
        else if(tokens[i].equals("/")){
            int b = stack.pop(); // second operand
            int a = stack.pop(); // first operand
            result = a / b;
              stack.push(result);

        }
        else{
          stack.push(Integer.parseInt(tokens[i]));
        }

      }

     return stack.pop();
     
        
    }
}