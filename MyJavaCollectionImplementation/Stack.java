package MyJavaCollectionImplementation;

public class Stack {

    private Object[] arr;
    private int size;

    public Stack(){
        this.arr = new Object[10];
        this.size = 0;
    }
    /**
     * Description: Add an Object to the Stack.
     * Pre-Condition: o must be a valid Object.
     * Post-Condition: Object is added to the Stack.
     * @author Blake Truong
     * */
    public void push(Object o){

        if(this.size + 1 > arr.length){ //Create bigger array if needed.
            Object[] temp = this.arr;
            arr = new Object[temp.length * 2];
            for(int i = 0; i < temp.length; i++){
                this.arr[i] = temp[i];
            }
        }

        arr[this.size++] = o;

    }
    /**
     * Description: Returns and removes the Object at the top of the Stack. If empty stack return null object and Prints EmptyStackException in this case
     * Pre-Condition: Nothing.
     * Post-Condition: Return and removes the Object at the top of the Stack.
     * @author Blake Truong
     * */
    public Object pop(){

        if(this.size == 0){
            System.out.println("EmptyStackException");
            //throw new EmptyStackException();
            return null;
        }

        return arr[--this.size];

    }
    /**
     * Description: Returns the number of elements within the Stack.
     * Pre-Condition: Nothing.
     * Post-Condition: Returns the number of elements in the Stack.
     * @author Blake Truong
     * */
    public int size(){
        return this.size;
    }
    /**
     * Description: Returns a formatted string of information about the Stack.
     * Pre-Condition: Nothing.
     * Post-Condition: returns a string of information from the Stack.
     * @author Blake Truong
     * */
    public String toString(){
        String s = "[";

        for(int i = 0; i < size(); i++){

            s = s + (arr[i] == null ? "null": arr[i].toString());
            if(i != this.size-1){
                s = s + ",";
            }

        }

        return s + "]";
    }
    /**
     * Description: Returns a Boolean if the number of elements within the Stack
     * Pre-Condition: Nothing.
     * Post-Condition: Returns a Boolean whether the Stack is empty.
     * @author Blake Truong
     * */
    public boolean isEmpty(){
        return this.size == 0;
    }
    /**
     * Description: Returns a boolean whether two Stack are equals. First, it checks size then the individual elements.
     * Pre-Condition: list must be a valid Queue
     * Post-Condition: returns a boolean if the two Stack equals.
     * @author Blake Truong
     * */
    public boolean equals(Stack stack){

        if(this.size != stack.size()){
            return false;
        }

        for(int i = 0; i < this.size; i++){
            if(this.arr[i] != null && stack.arr[i] != null){
                if(!this.arr[i].equals(stack.arr[i])){
                    return false;
                }
            }
            else if(this.arr[i] != null || stack.arr[i] != null){
                return false;
            }
        }

        return true;

    }
}
