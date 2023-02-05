package Data_Structures;


import MidTermPart2.A;

/**
 * Description: ArrayList implementation of the ArrayList interface (note: this ArrayList does not take null objects)
 * @Author Kelvin Le
 */
public class ArrayList {

    private Object[] arr; // [25,4,3,1,7] = arr length is 5
                            // arr = [25,4,3,1,7,8,null,null,null,null] = length 10
    private int size; //keeps track of how many objects in our array


    /**
     * Description: ArrayList  no-Args Constructor which initialize size to 0 and create an Object array of size 1
     * PRE: none
     * POST: initialize size to 0 and create an Object array of size 1
     */
    public ArrayList(){
        this.arr = new Object[1];
        this.size = 0;
    }

    /**
     * Description: insert the object at a given index of the ArrayList
     * PRE: other != null, index > this.size, index < 0
     * POST: insert the object at a given index of the ArrayList
     */
    public void insert(Object other, int index){

        if(index > this.size || index < 0){
            System.out.println("cannot insert");
            return;
        }

        if(this.size + 1 > this.arr.length){ //allocate

            Object[] temp = new Object[this.arr.length*2];

            for(int i = 0; i < this.size; i++){
                temp[i] = this.arr[i];
            }

            this.arr = temp;
        }

        for(int i = this.size; i > index; i--){
            this.arr[i] = this.arr[i-1];
        }
        this.arr[index] = other;
        this.size++;
    }

    /**
     * Description: removes and return the object at a given index of the ArrayList
     * PRE: index < 0 && index > this.size - 1
     * POST: remove and return the object at a given index of the ArrayList
     */
    public Object remove(int index){

        if(isEmpty()){
            System.out.println("Empty");
            return null;
        }

        if(index > this.size - 1 || index < 0){
            System.out.println("Invalid Index");
            return null;
        }

        Object removed = this.arr[index];

        for(int i = index; i < this.size - 1; i++){ //[2,3,1,1] size = 4
            this.arr[i] = this.arr[i+1];
        }

        this.size--;

        return removed;
    }

    /**
     * Description: return number of objects in out array.
     * PRE: none
     * POST: return number of objects in our array.
     */
    public int size(){
        return this.size;
    }

    /**
     * Description: format array into String
     * PRE: none
     * POST: returns a formatted String of our ArrayList
     */
    public String toString(){ // [1,2,3,4,5] [star,blue,black,red] // null objects

        if(isEmpty()){
            return "[]";
        }

        String s = "[" + this.arr[0];

        for(int i = 1; i < this.size; i++){
            s = s + "," + this.arr[i];
        }

        return s + "]";
    }

    /**
     * Description: checks to see if ArrayList is empty
     * PRE: none
     * POST: return boolean whether ArrayList is empty.
     */
    public boolean isEmpty(){
        return this.size == 0;
    }

    /**
     * Description: returns the index of Object within ArrayList
     * PRE: other != null;
     * POST: return the index of Object within ArrayList
     */
    public int indexOf(Object other){ // other = 3 [4,7,2,3,7,1] size = 6;

        if(other == null){
            return -1;
        }

        for(int i = 0; i < this.size; i++){
            if(other == this.arr[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * Description: compares two ArrayList
     * PRE: other != null
     * POST: return boolean whether two ArrayList are equal.
     */
    public boolean equals(ArrayList other){

        if(other == null || this.size != other.size){
            return false;
        }

        for(int i = 0; i < this.size; i++){
            if(!this.arr[i].equals(other.get(i))){
                return false;
            }
        }

        return true;
    }

    /**
     * Description: return object at a given index within ArrayList
     * PRE: index is valid
     * POST: return the object at a given index within ArrayList
     */
    public Object get(int index){
        if(this.isEmpty()){
            System.out.println("Empty");
            return null;
        }
        if(this.size < index || index < 0){
            System.out.println("Invalid index");
            return null;
        }

        return this.arr[index];

    }

}
