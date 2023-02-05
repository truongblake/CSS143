package Data_Structures;
/**
 * Description: Stack from Stack Data Structure interface
 * @Author Kelvin Le
 */
public class Stack {

    private ArrayList stack;

    /**
     * Description: no-args constructor, creates an ArrayList behave like a queue
     */
    public Stack(){
        this.stack = new ArrayList();
    }
    /**
     * Description: inserts an object at the top of the stack
     * PRE: none
     * POST: inserts an object at the top of the stack
     */
    public void push(Object other){ //[other1, other2] size = 1
        this.stack.insert(other, this.stack.size());
    }
    /**
     * Description: removes the object at the top of the stack
     * PRE: stack != empty
     * POST: removes the object at the top of stack
     */
    public Object pop(){ //[1,2,3,4,5,6]
        return this.stack.remove(this.stack.size()  -1);
    }
    /**
     * Description: returns the number of contents in Stack
     * PRE: none
     * POST: returns the number of contents in Stack
     */
    public int size(){
        return this.stack.size();
    }
    /**
     * Description: returns formatted String of stack contents
     * PRE: none
     * POST: returns String format of stack contents
     */
    public String toString(){
        return this.stack.toString();
    }
    /**
     * Description: Returns boolean whether this Stack is empty
     * PRE: none
     * POST: returns boolean if this Stack is empty
     */
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    /**
     * Description: returns a boolean if Stack is equals to another Stack
     * PRE: Stack != null
     * POST: returns a boolean if Stack is equals to another other Stack
     */
    public boolean equals(Stack other){
        return this.stack.equals(other.stack);
    }

}
