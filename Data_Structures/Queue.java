package Data_Structures;

/**
 * Description: Queue from the Queue Data Structure Interface
 * PRE:
 * POST:
 */
public class Queue {

    ArrayList queue;
    /**
     * Description: no-args constructor, creates an ArrayList that will behave like a queue
     */
    public Queue(){
        this.queue = new ArrayList();
    }
    /**
     * Description: enqueue an object into the queue
     * PRE: none
     * POST: enqueue an object into the queue
     */
    public void enqueue(Object other){
        this.queue.insert(other,this.queue.size());
    }
    /**
     * Description: returns and dequeues an object at the front of the queue
     * PRE: none
     * POST: returns and dequeues an object at the front of the queue
     */
    public Object dequeue(){
        return this.queue.remove(0);
    }
    /**
     * Description: returns the number of contents in queue
     * PRE: none
     * POST: returns the number of contents in queue
     */
    public int size(){
        return this.queue.size();
    }
    /**
     * Description: returns formatted String of queue contents
     * PRE: none
     * POST: returns String format of queue contents
     */
    public String toString(){
        return this.queue.toString();
    }
    /**
     * Description: Returns boolean whether this Queue is empty
     * PRE: none
     * POST: returns boolean if this Queue is empty
     */
    public boolean isEmpty(){
        return this.queue.isEmpty();
    }
    /**
     * Description: returns a boolean if Queue is equals to another Queue
     * PRE: Queue != null
     * POST: returns a boolean if Queue is equals to another other Queue
     */
    public boolean equals(Queue other){
        return this.queue.equals(other.queue);
    }
}
