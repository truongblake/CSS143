package FractionV2;

/**
 * Description: FractionCounter class that counts the number of a given fraction that've been seen
 * @Author: Katie Nguyen
 */
public class FractionCounter {

    private Fraction fraction;
    private int counter;
    /**Description: Creates a Fraction Counter and keeps count of given a fraction
     * PRE: none
     * POST: FractionCounter starts at 1 count for given fraction
     */
    public FractionCounter(Fraction theFraction){

        this.fraction = theFraction;
        this.counter = 1;

    }
    /**Description: increments FractionCounter if fraction is equal to this FractionCounter's fraction
     * PRE: none
     * POST: increments FractionCounter if fraction is equal to this FractionCounter's fraction
     */
    public boolean compareAndIncrement(Fraction fraction){
        if(fraction.equals(this.fraction)){
            counter++;
            return true;
        }
        return false;
    }
    /**Description: returns a formatted String with fraction count
     * PRE: none
     * POST: returns a formatted String with fraction count
     */
    public String toString(){
        return fraction.toString() + " has a count of " + counter;
    }

}
