import java.util.*;
public class minStack {
   
        public void MinStack() {
        Stack<Integer> stack = new Stack();
        Stack<Integer> minStack = new Stack();
        }
        
        public void push(int val) {
            if(minStack.isEmpty() || val <=minStack.peek())
        {
            minStack.push(val);
        }
        
        stack.push(val);
        }
        
        public void pop() {
            if(stack.peek().equals(minStack.peek()))
        {
            minStack.pop();
        }
        stack.pop();
        }
        
        public int top() {
           return stack.peek();
        }
        
        public int getMin() {
        return minStack.peek();
        }


     public static void main(String[] args)
        {
            minStack s = new minStack();
           
              // Function calls
            s.push(-2);
            s.push(0);
            s.push(-3);
           System.out.println(s.getMin());
            s.pop();
            s.top();
         System.out.println(s.getMin());   
           
        }
    
    }