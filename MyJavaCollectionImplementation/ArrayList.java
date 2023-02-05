package MyJavaCollectionImplementation;

/***
 * Description:
 *
 */
public class ArrayList {
    private Object[] arr;
    private int size;

    public ArrayList(){
        this.size = 0;
        this.arr = new Object[10];
    }
    /**
     * Description: Inserts Object at a valid index. Else throws an out-of-bounds exception.(Prints exception in this case)
     * Pre-Condition: o must be a valid Object. Index must be greater than 0 and less than the size.
     * Post-Condition: Inserts object at specified index within the Arraylist.
     * @author Blake Truong
     * */
    public void insert(Object o, int index){

        if(index < 0 || index > this.size){
            System.out.println("Index " + index + " out of bounds for length " + size);
            //throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
            return;
        }

        if(this.size + 1 > arr.length){ //Create bigger array if needed.
            System.out.println("creating bigger array");
            Object[] temp = this.arr;
            arr = new Object[temp.length * 2];
            for(int i = 0; i < temp.length; i++){
                this.arr[i] = temp[i];
            }
        }

        this.size++;

        for(int i = this.size - 1; i > index; i--){ //shift everything
            arr[i] = arr[i-1];
        }

        arr[index] = o;

    }
    /**
     * Description: Returns and Removes an Object at a valid index. Else throws an out-of-bounds index and return a null object. (Prints Exception in this case)
     * Pre-Condition: Index must be a valid Integer.
     * Post-Condition: Returns the removed Object within the Arraylist.
     * @author Blake Truong
     * */
    public Object remove(int index){

        if(index < 0 || index > this.size || this.size == 0){
            System.out.println("Index " + index + " out of bounds for length " + size);
            //throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
            return null;
        }

        Object removed = this.arr[index];

        for(int i = index; i < this.size - 1; i++){
            this.arr[i] = this.arr[i+1];
        }

        this.size--;

        return removed;

    }
    /**
     * Description: Returns the number of elements within the Arraylist.
     * Pre-Condition: None
     * Post-Condition: Returns the number of elements as an integer.
     * @author Blake Truong
     * @params
     *
     * */
    public int size(){
        return this.size;
    }
    /**
     * Description: Returns a formatted string of information about the Arraylist.
     * Pre-Condition: Nothing.
     * Post-Condition: returns a string of information from the Arraylist.
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
     * Description: Returns a Boolean if the number of elements within the Arraylist list 0
     * Pre-Condition: Nothing.
     * Post-Condition: Returns a Boolean whether the Arraylist is empty.
     * @author Blake Truong
     * */
    public boolean isEmpty(){
        return size() == 0;
    }
    /**
     * Description: Returns the index location of an Object within an Arraylist.
     * Pre-Condition: o must be a valid object.
     * Post-Condition: Returns an Integer of the index location of an Object within Arraylist.
     * @author Blake Truong
     * */
    public int indexOf(Object o){
        if(o == null){
            return -1;
        }
        for(int i = 0; i < size(); i++){
            if(o.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
    /**
     * Description: Returns a boolean whether two Arraylists are equals. First, it checks size then the individual elements.
     * Pre-Condition: list must be a valid Arraylist
     * Post-Condition: returns a boolean if the two Arraylists equals.
     * @author Blake Truong
     * */
    public boolean equals(ArrayList list){

        if(this.size != list.size()){
            return false;
        }

        for(int i = 0; i < this.size(); i++){
            if(this.arr[i] != null && list.arr[i] != null){
                if(!this.arr[i].equals(list.arr[i])){
                    return false;
                }
            }
            else if(this.arr[i] != null || list.arr[i] != null){
                return false;
            }
        }

        return true;

    }
    /**
     * Description: Returns the Object at a given index within the Arraylist. Will throw a IndexOutOfBoundsException and return a null object. (Prints Exception in this case)
     * Pre-Condition: index must be an Integer.
     * Post-Condition: returns the Object at a given index within the Arraylist.
     * @author Blake Truong
     * */
    public Object get(int index){

        if(index < 0 || index > this.size){
            System.out.println("Index " + index + " out of bounds for length " + size);
            //throw new IndexOutOfBoundsException();
            return null;
        }
        return arr[index];
    }
    
}
