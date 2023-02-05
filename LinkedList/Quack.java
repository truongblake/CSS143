package LinkedList;

/**
 * Write a description of class Quack here.
 *
 * Katie Nguyen
 * 8/9/2022
 */
public class Quack
{
    private Node head = null; //the start of the linked list
    private class Node
    {
        private Object data;
        private Node next;
        public Node(Object d, Node n)
        {
            this.data = d;
            this.next = n;
        }
    }

    public static void main(String[] args) {
        Quack empty = new Quack();
        Quack one = new Quack();
        Quack two = new Quack();
        Quack multiple = new Quack();

        one.append(5);
        multiple.append(10);
        multiple.append(20);
        multiple.append(30);

        System.out.println("Empty (should print nothing): " + empty);     // ( note the implicit call to toString()! )
        System.out.println("One (should print '5'): " + one);
        System.out.println("Multiple (should print '10, 20, 30'): " + multiple);

        one.delete(0);
        multiple.delete(1);
        System.out.println("One (upon delete) (should be empty): " + one);
        System.out.println("Multiple (upon delete) (should be '10, 30'): " + multiple);

        System.out.println("Attempting an illicit insert at index 5. Error message should print: ");
        //one.insert(400, 5);
        System.out.println("One (on insert) (should still be empty): " + one);

        //conducting more tests
        //testing insert method
        multiple.insert(100, 1);
        multiple.insert(200, 2);
        multiple.insert(300, 3);
        System.out.println("Multiple (upon insert) (should be '10, 100, 200, 300, 30'): "
                + multiple);

        //testing removing method
        System.out.println("Multiple (upon remove) (should print 10): "
                + multiple.remove(0));
        System.out.println(multiple);
        System.out.println("Multiple (upon remove) (should print 300): "
                + multiple.remove(2));

        //empty method
        System.out.println("Multiple (check if empty) (should print false): "
                + multiple.isEmpty());
        System.out.println("One (check if empty) (should print true): "
                + one.isEmpty());

        //get method
        System.out.println("Multple (get index 2) (should print 200 ): "
                + multiple.get(2));
        //System.out.println("one (get index 2) (should print error message ): "
        //+ one.get(2));

        //index of method
        System.out.println("Multple (get index of 30) (should print 2): "
                + multiple.indexOf(30));

        // get size method
        System.out.println("Multiple (get size) (should print 3): "
                + multiple.size());

        //equals method
        two.insert(100, 0);
        two.insert(200, 1);
        two.append(30);
        System.out.println(two);
        System.out.println(multiple);
        System.out.println("Comparing two and multiple (should return true): "
                + multiple.equals(two));
    }
    protected void insert(Object newData, int index) {
        if(index < 0){
            throw new IndexOutOfBoundsException("invalid index (negative)");
        }
        //create new node
        Node newNode = new Node(newData, null);
        int count = 0;
        if (this.head == null)
        {
            //adding to an empty list, insert at index 0
            if(index == 0)
            {
                this.head = newNode;
            }
            else
            {
                throw new IllegalStateException("empty linked list");
            }
        }
        else
        {
            Node currentNode = this.head;
            while(currentNode != null)
            {
                if(count + 1 == index)
                {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    return;
                }
                else
                {
                    count++;
                    currentNode = currentNode.next;
                }
            }
            throw new IndexOutOfBoundsException("invalid index");
        }
    }
    public String toString() {

        String s = "[";
        Node currentNode = this.head;
        while (currentNode != null) {

            s = s + currentNode.data;
            if(currentNode.next != null){
                s = s + ",";
            }
            currentNode = currentNode.next;
        }
        s = s + "]";
        return s;
    }
    public int size(){
        int size = 0;
        Node currentNode = this.head;
        while(currentNode != null){
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }
    public boolean isEmpty() {
        return this.head == null;
    }
    protected void append(Object newData) {
        this.insert(newData,this.size());
    }
    protected Object remove(int index) {
        if(isEmpty()){
            throw new IllegalStateException("empty linked list");
        }else if(index < 0 || index >= this.size()){
            throw new IndexOutOfBoundsException("invalid index");
        }
        Node currentNode = this.head;
        Object removedObject = null;
        if(index == 0){
            removedObject = this.head.data;
            this.head = this.head.next;
        }else{
            for(int i = 0; i < this.size(); i++){
                if (i + 1 == index) {
                    removedObject = currentNode.next.data;
                    currentNode.next = currentNode.next.next;
                    return removedObject;
                }
                currentNode = currentNode.next;
            }
        }
        return removedObject;
    }
    protected void delete(int index) {
            this.remove(index);
    }
    protected Object get(int index) {
        if(isEmpty()){
            throw new IllegalStateException("empty linked list");
        }else if(index < 0 || index >= this.size()){
            throw new IndexOutOfBoundsException("invalid index");
        }

        Node currentNode = this.head;
        for(int i = 0; i < this.size(); i++){
            if(i == index){
                break;
            }
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    protected int indexOf(Object target) {
        Node currentNode = this.head;
        for(int i = 0; i < this.size(); i++){
            if(target == null && currentNode.data == null
                    || target != null && target.equals(currentNode.data)){
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }
    public boolean equals(Object other) {
        if(other.getClass() != this.getClass()){
            return false;
        }

        Quack quack = (Quack) other;

        if(this.size() != quack.size()){
            return false;
        }

        Node currentQuack = quack.head;
        Node currentNode = this.head;
        for(int i = 0; i < quack.size(); i++){
            if(currentNode.data == null && currentQuack.data == null){
                currentQuack = currentQuack.next;
                currentNode = currentNode.next;
                continue;
            }
            if(currentNode.data == null ||
                    !currentNode.data.equals(currentQuack.data)){
               return false;
            }
            currentQuack = currentQuack.next;
            currentNode = currentNode.next;
        }
        return true;
    }
}
