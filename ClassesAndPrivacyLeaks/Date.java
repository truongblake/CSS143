package ClassesAndPrivacyLeaks;


public class Date {

    private int month, year, day;
    /**Description: constructs a valid date
     * Post-Condition: creates an instance of Date class with a valid date
     * @author Blake Truong
     * */
    Date(int month, int day, int year){
        this.month = month < 1 || month > 12 ? 1: month;
        this.day = day < 1 || day > 31 ? 1: day;
        this.year = year < 2014 || year > 2024 ? 2014: year;
    }
    /**Description: constructs a copy of another Date instance.
     * Post-Condition: creates an instance of Date class.
     * @author Blake Truong
     * */
    Date(Date d){
        this(d.month,d.day,d.year);
    }
    /**Description: returns day
     * Post-Condition: returns day
     * @author Blake Truong
     * */
    public int getDay() {
        return day;
    }
    /**Description: returns month
     * Post-Condition: return month
     * @author Blake Truong
     * */
    public int getMonth() {
        return month;
    }
    /**Description: return year
     * Post-Condition: return year
     * @author Blake Truong
     * */
    public int getYear() {
        return year;
    }
    /**Description: sets day. Will return nothing if user's day is an invalid day.
     * Post-Condition: sets day.
     * @author Blake Truong
     * */
    public void setDay(int day) {
        if(day < 1 || day > 31){
            System.out.println("invalid day");
            return;
        }
        this.day = day;
    }
    /**Description: sets month. Will return nothing if user's month is an invalid month.
     * Post-Condition: sets month.
     * @author Blake Truong
     * */
    public void setMonth(int month) {
        if(month < 1 || month > 12){
            System.out.println("invalid month");
            return;
        }
        this.month = month;
    }
    /**Description: sets year. Will return nothing if user's year is an invalid year.
     * Post-Condition: sets year.
     * @author Blake Truong
     * */
    public void setYear(int year) {
        if(year < 2014 || year > 2024){
            System.out.println("invalid year");
            return;
        }
        this.year = year;
    }
    /**Description: checks to see if this Date is equal to otherObject Date.
     * Pre-Condition: otherObject is a Date Object
     * Post-Condition: returns boolean
     * @author Blake Truong
     * */
    public boolean equals(Object otherObject){
        Date other = (Date) otherObject;
        return this.month == other.month && this.day == other.day && this.year == other.year;
    }
    /**Description: compares years than month then days to determine which Date is greater than the other.
     * Will return 1 if this Date is greater 0 if its equal and -1 if it'ss less than.
     * Pre-Condition:
     * Post-Condition: returns an integer that represents greater, less, equal.
     * @author Blake Truong
     * */
    public int compareTo(Date other){
        if(this.year > other.year
                || this.year == other.year && this.month > other.month
                || this.year == other.year && this.month == other.month && this.day > other.day){
            return 1;
        }
        else if (this.equals(other)){
            return 0;
        }
        else{
            return -1;
        }



    }
    /**Description: return a string of information about this Date
     * Post-Condition: return a string of the Date
     * @author Blake Truong
     * */
    public String toString(){
        return this.month + "/" + this.day + "/" + this.year;
    }
}
