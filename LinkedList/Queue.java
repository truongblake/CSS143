package LinkedList;

public class Queue extends Quack{
    public void enqueue(Object next)
    {
        this.append(next);
    }
    public Object dequeue()
    {
        return this.remove(0);
    }

    public String toString()
    {
        return super.toString();
    }

    public static void main(String[] args)
    {

    }
}
