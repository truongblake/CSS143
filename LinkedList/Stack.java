package LinkedList;

public class Stack extends Quack{
    public void push(Object next)
    {
        this.append(next);
    }
    public Object pop()
    {
        return remove(size()-1);
    }
    public Object peek()
    {
        return get(this.size()-1);
    }
    public String toString()
    {
        return super.toString();
    }
}
