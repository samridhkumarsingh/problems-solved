// class MinStack {  //approch 1
//  Stack<Integer> s;
//  Stack<Integer>min;
//  int val;
//     public MinStack() {
//         s=new Stack<>();
//         min=new Stack<>();
//     }
    
//     public void push(int value) {
//         s.push(value);

//         if(min.isEmpty()||min.peek()>=s.peek())
//             min.push(value);
//     }
    
//     public void pop() {
//          if(!s.isEmpty())
//           val=s.pop();
//         if(min.peek()==val)
//             min.pop();
        
//     }
    
//     public int top() {
//         if(s.isEmpty()) return -1;
//         return s.peek();
//     }
    
//     public int getMin() {
//         if(!min.isEmpty()) return min.peek();
//         return -1;
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


 class MinStack {
    int min;
    Stack<Integer> s;
    public MinStack() {
        s=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int value) {
       if(value<=min)
       {
         s.push(min);
         min=value;
       }
       s.push(value);
    }
    
    public void pop() {
       if(s.pop()==min)
        min=s.pop();
       
    }
    
    public int top() {
        if(!s.isEmpty()) return s.peek();
        return -1;
    }
    
    public int getMin() {
        return min;
    }
}