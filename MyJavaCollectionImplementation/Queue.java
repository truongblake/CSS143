package MyJavaCollectionImplementation;

public class Queue {
    private Object[] arr;
    private int size;

    public Queue(){
        this.arr = new Object[10];
        this.size = 0;
    }
    /**
     * Description: Adds the Object to the front of the Queue.
     * Pre-Condition: o must be valid Object.
     * Post-Condition: Object added is in the Queue.
     * @author Blake Truong
     * */
    public void enqueue(Object o){

        if(this.size + 1 > arr.length){ //Create bigger array if needed.
            Object[] temp = this.arr;
            arr = new Object[temp.length * 2];
            for(int i = 0; i < temp.length; i++){
                this.arr[i] = temp[i];
            }
        }

        this.arr[this.size++] = o;

    }
    /**
     * Description: Returns and removes the first Object in queue. If the queue is empty, returns null object and print EmptyQueue.
     * Pre-Condition: Nothing
     * Post-Condition: Returns and removes the first Object in queue.
     * @author Blake Truong
     * */
    public Object dequeue(){

        if(this.size == 0){
            System.out.println("Empty Queue");
            return null;
        }

        Object temp = this.arr[0];

        for(int i = 0; i < this.size - 1; i++){
            this.arr[i] = this.arr[i+1];
        }

        this.size--;

        return temp;

    }
    /**
     * Description: Returns the number of elements within the Queue.
     * Pre-Condition: Nothing.
     * Post-Condition: Returns the number of elements in the Queue.
     * @author Blake Truong
     * */
    public int size(){
        return this.size;
    }
    /**
     * Description: Returns a formatted string of information about the Queue.
     * Pre-Condition: Nothing.
     * Post-Condition: returns a string of information from the Queue.
     * @author Blake Truong
     * */
    public String toString(){
        String s = "[";

        for(int i = 0; i < this.size; i++){
            s = s + (arr[i] == null ? "null": arr[i].toString());
            if(i != this.size-1){
                s = s + ",";
            }

        }

        return s + "]";
    }
    /**
     * Description: Returns a Boolean if the number of elements within the Queue list 0
     * Pre-Condition: Nothing.
     * Post-Condition: Returns a Boolean whether the Queue is empty.
     * @author Blake Truong
     * */
    public boolean isEmpty(){
        return this.size == 0;
    }
    /**
     * Description: Returns a boolean whether two Queue are equals. First, it checks size then the individual elements.
     * Pre-Condition: list must be a valid Queue
     * Post-Condition: returns a boolean if the two Queue equals.
     * @author Blake Truong
     * */
    public boolean equals(Queue queue){
        if(this.size != queue.size()){
            return false;
        }

        for(int i = 0; i < this.size; i++){
            if(this.arr[i] != null && queue.arr[i] != null){
                if(!this.arr[i].equals(queue.arr[i])){
                    return false;
                }
            }
            else if(this.arr[i] != null || queue.arr[i] != null){
                return false;
            }
        }

        return true;
    }
}
