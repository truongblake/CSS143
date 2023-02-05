package FractionV2;

/**
 * Description: Fraction class that contains the simplest fraction.
 * @author Kelvin Le
 */
public class Fraction {

    private int num;
    private int denom;

    /**Description: constructs a Fraction object. If denominator is 0 than default to 1/1 Fraction object.
     * PRE: denominator cannot be 0
     * POST: instantiate a Fraction object.
     */
    public Fraction(int num, int denom){

        if(denom == 0) {
            this.denom = 1;
            this.num = 1;
        }else if(denom < 0 && num > 0) {
            this.num = -num / gcd(num, denom);
            this.denom = -denom / gcd(num, denom);
        }else{
            this.num = num / gcd(num, denom);
            this.denom = denom / gcd(num, denom);
        }

    }
    /**Description: default Constructor instantiates a 0/1 fraction.
     * PRE: none
     * POST: instantiates a 0/1 fraction.
     */
    public Fraction(){
        this(0,1);
    }
    /**Description: getter for denominator
     * PRE: none
     * POST: returns denominator
     */
    public int getDenominator() {
        return denom;
    }
    /**Description: getter for numerator
     * PRE: none
     * POST: returns numerator
     */
    public int getNumerator() {
        return num;
    }
    /**Description: setter for denominator
     * PRE: denominator != 0
     * POST: sets the denominator
     */
    public void setDenominator(int denom) {
        if(denom != 0) {
            this.denom = denom;
        }
    }
    /**Description: setter for numerator
     * PRE: none
     * POST: sets the numerator
     */
    public void setNumerator(int num) {
        this.num = num;
    }
    /**Description: Checks to see if fraction object is equal.
     * Pre-Condition: other must be a fraction object.
     * Post-Condition: returns true if object's numerator and denominator is equal to this fraction.
     * @author Blake Truong
     */
    public boolean equals(Object other){
        Fraction fraction = (Fraction) other;
        if(fraction.num == this.num && fraction.denom == this.denom){ //returns true if fraction is equal to this fraction object
            return true;
        }else{
            return false; //return false if this fraction is not equal to this fraction object
        }
    }
    /**Description: returns formatted String
     * PRE: none
     * POST: returns formatted String
     */
    public String toString(){
            return this.num + "/" + this.denom; //prints normally
    }
    /**Description: returns the greatest common denominator
     * PRE: none
     * POST: returns the greatest common denominator
     */
    private int gcd(int x, int y){
        if(x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        while(y%x != 0){
            x = y%x;
        }
        return x;
    }
}
