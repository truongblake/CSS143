package ClassesAndPrivacyLeaks;

public class Weight {
    private int lbs, oz;
    /**Description: Creates an instance of Weight with 0 oz and user's lbs as an argument.
     * If user's lbs is negative then the default value will be 0 lbs.
     * Post-Condition: creates an instance of Weight with user's weight and 0 oz
     * @author Blake Truong
     * */
    Weight(int lbs){
        if(lbs < 0){
            System.out.println("lbs is Negative, Defaulting to 0 lbs");
            this.lbs = 0;
        }else {
            this.lbs = lbs;
        }
        this.oz = 0;
    }
    /**Description: Creates a instance of Weight with user's given lbs and oz as arguments. Weight will default to 0 weight if invalid arguments is passed.
     * Pre-Condition:
     * Post-Condition:
     * @author Blake Truong
     * */
    Weight(int lbs, int oz){
        if (lbs < 0 || oz < 0 || oz > 16) {
            System.out.println("Invalid Arguments, Defaulting to 0 lbs and 0 oz;");
            this.lbs = 0;
            this.oz = 0;
        }
        this.lbs = lbs;
        this.oz = oz;
    }
    /**Description: Calls on Weight(int lbs, int oz) constructor to create an instance of other weights as arguments. Which is a copy.
     * Post-Condition: Creates an instance copy of other Weight
     * @author Blake Truong
     * */
    Weight(Weight other){
        this(other.lbs, other.oz);
    }
    /**Description: returns lbs
     * Post-Condition: returns lbs
     * @author Blake Truong
     * */
    public int getLbs() {
        return lbs;
    }
    /**Description: returns oz
     * Post-Condition: returns oz
     * @author Blake Truong
     * */
    public int getOz() {
        return oz;
    }
    /**Description: set lbs. if lbs is negative then setlbs method will return without any change.
     * Post-Condition: sets lbs
     * @author Blake Truong
     * */
    private void setLbs(int lbs) {
        if(lbs < 0){
            System.out.println("Invalid lbs");
            return;
        }
        this.lbs = lbs;
    }
    /**Description: sets oz. If oz is negative then setoz method will return without any change.
     * Post-Condition: sets oz
     * @author Blake Truong
     * */
    private void setOz(int oz) {
        if(oz <=  0 || oz >= 16){
            System.out.println("Invalid oz");
            return;
        }
        this.oz = oz;
    }
    /**Description: returns current weight including lbs and oz as one unit.
     * Post-Condition: returns current Weight
     * @author Blake Truong
     * */
    public double getWeight(){
        return this.lbs + (double) this.oz/16;
    }
    /**Description: calls setters methods to set lbs and oz.
     * Pre-Condition: lbs and oz are valid Weights
     * Post-Condition: sets lbs and weight
     * @author Blake Truong
     * */
    public void setWeight(int lbs, int oz){
        setLbs(lbs);
        setOz(oz);
    }
    /**Description: calls on add(int lbs, int oz) to add user's lbs argument to current weight.
     * Post-Condition: adds lbs to current weight.
     * @author Blake Truong
     * */
    public void add(int lbs){
        add(lbs, 0);
    }
    /**Description: Adds all current weight and user's argument weights and check to see if total is negative.
     * If so, then method will return without changing anything and send an invalid arguments. Else the method will add user's argument to current weight.
     * This will also automatically convert excessive oz to lbs or vice versa.
     * Pre-Condition: lbs and oz are valid integers
     * Post-Condition: adds user's lbs and oz arguments to current weight.
     * @author Blake Truong
     * */
    public void add(int lbs, int oz){

        if((this.lbs + lbs) * 16 + this.oz + oz < 0){ //converts everything too ounces then sums all if its < 0 then invalid negative weight
            System.out.println("Invalid, Negative Weight");
            return;
        }
        this.lbs += lbs + (this.oz + oz)/16;
        if((this.oz + oz)%16 < 0){
            this.lbs--;
            this.oz = (this.oz + oz)%16 + 16;
        }else {
            this.oz = (this.oz + oz) % 16;
        }

    }
    /**Description: calls on add(int lbs, int oz) with other's oz and lbs as arguments. Which will add other's weight to this current weight.
     * Pre-Condition: other is a valid Weight and cannot be null.
     * Post-Condition: add's other weight to current weight.
     * @author Blake Truong
     * */
    public void add(Weight other){
        add(other.lbs, other.oz);
    }
    /**Description: checks to see if this Weight is equal to object o, where o is a Weight object.
     * Pre-Condition: Object is a Weight object
     * Post-Condition: returns a boolean
     * @author Blake Truong
     * */
    public boolean equals(Object o){
        Weight other = (Weight) o;
        return this.lbs == other.lbs && this.oz == other.oz;
    }
    /**Description: creates a string of information about this weight
     * Post-Condition: returns a string of lbs and oz.
     * @author Blake Truong
     * */
    public String toString(){
        return this.lbs + " lbs. " + this.oz + " oz.";
    }
}
