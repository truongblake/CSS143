package ClassesAndPrivacyLeaks;

public class YoungHuman {
    private Weight currentWeight;
    private Date birthDate, lastCheckUpDate;
    private String lastName, firstName;

    /**Description: constructs a YoungHuman with user's argument except lastCheckUpDate is null
     * Pre-Condition: all Arguments are valid objects
     * Post-Condition: creates a instance of YoungHuman with given arguments.
     * @author Blake Truong
     * */
    YoungHuman(Weight weight, Date birthDate, String firstName, String lastName){
        this.currentWeight = weight;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        lastCheckUpDate = null;
    }
    /**Description: constructs a YoungHuman that is a copy of another YoungHuman, except lastCheckupDate is null.
     * Post-Condition: creates an instance copy of another YoungHuman.
     * @author Blake Truong
     * */
    YoungHuman(YoungHuman toCopy){
        this(toCopy.currentWeight,toCopy.birthDate,toCopy.firstName,toCopy.lastName);
    }
    /**Description: Returns birthDate
     * Post-Condition: returns birthDate
     * @author Blake Truong
     * */
    public Date getBirthDate(){
        return this.birthDate;
    }
    /**Description: returns Date of Last Check Up
     * Post-Condition: returns Date of last check up
     * @author Blake Truong
     * */
    public Date getLastCheckUpDate() {
        return lastCheckUpDate;
    }
    /**Description: returns first and last name
     * Post-Condition: returns first and last name
     * @author Blake Truong
     * */
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    /**Description: returns boolean if has had check up
     * Post-Condition: return boolean if lastCheckUpDate
     * @author Blake Truong
     * */
    public boolean hasHadCheckUp(){
        return lastCheckUpDate != null;
    }
    /**Description: sets LastCheckUpDate. If lastCheckUpDate is before birthDate then return and do nothing.
     * Pre-Condition: dateOfCheckUp is a valid date
     * Post-Condition: sets LastCheckUpDate to dateOfCheckUp
     * @author Blake Truong
     * */
    public void setCheckUp(Date dateOfCheckUp){
        if(birthDate.compareTo(dateOfCheckUp) == 1){
            System.out.println("birthDate is greater than checkUpDate");
            return;
        }
        this.lastCheckUpDate = dateOfCheckUp;
    }
    /**Description: sets LastCheckUpDate to null
     * Post-Condition: sets LastCheckUpDate to null
     * @author Blake Truong
     * */
    public void unsetCheckUpDate(){
        this.lastCheckUpDate = null;
    }
    /**Description: Sets birthDate. If birthDate is before Last Check Up then return and do nothing.
     * Pre-Condition: birthDate is a valid Date
     * Post-Condition: Sets birthDate
     * @author Blake Truong
     * */
    public void setBirthDate(Date birthDate){
        if(this.lastCheckUpDate != null && this.lastCheckUpDate.compareTo(birthDate) == 1){
            System.out.println("checkUpDate is greater than birthDate");
            return;
        }
        this.birthDate = birthDate;
    }
    /**Description: set currentWeight to amount
     * Pre-Condition: amount is a valid Weight
     * Post-Condition: sets currentWeight to amount
     * @author Blake Truong
     * */
    public void setWeight(Weight amount){
        this.currentWeight = amount;
    }
    /**Description: returns currentWeight
     * Post-Condition: returns currentWeight
     * @author Blake Truong
     * */
    public Weight getWeight(){
        return this.currentWeight;
    }
    /**Description: Sets firstname and lastname
     * Pre-Condition: first and last are valid Strings
     * Post-Condition: sets firstName and lastName
     * @author Blake Truong
     * */
    public void setName(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }
    /**Description: returns string of information of YoungHuman
     * Post-Condition: returns string of information of YoungHuman
     * @author Blake Truong
     * */
    public String toString(){
        return getName() + ", " + this.currentWeight.toString()
                + ", birth date: " + this.birthDate.toString()
                + ", last check-up: " + (this.hasHadCheckUp() ? this.lastCheckUpDate.toString(): "has not had a check-up");
    }
    /**Description: checks if all private variables of Younghuman is equal to another object besides lastCheckUpDate.
     * Pre-Condition:
     * Post-Condition: returns a boolean
     * @author Blake Truong
     * */
    public boolean equals(YoungHuman toCompare){
        return this.currentWeight.equals(toCompare.currentWeight)
                && this.birthDate.equals(toCompare.birthDate)
                && this.firstName.equalsIgnoreCase(toCompare.firstName)
                && this.lastName.equalsIgnoreCase(toCompare.lastName);
    }
}
