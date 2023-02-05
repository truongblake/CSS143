package ClassesAndPrivacyLeaks;

public class Driver {
    /**Description: YoungHuman Test
     * @author Blake Truong
     * */
    public static void main(String[] args){

        /* *** Testing Weight Class *** */

        System.out.println("Creating Weights with invalid Arguments");
        Weight w1 = new Weight(-1,0); //invalid
        Weight w2 = new Weight(0,-1); //invalid
        Weight w3 = new Weight(0,20); //invalid
        System.out.println("Creating a 0 lbs, 15 oz Weight");
        Weight w4 = new Weight(0,15);

        System.out.println("Now Adding 0 lbs and 2 oz, New Weight should be 1 lbs and 1 oz");
        w4.add(0,2);
        System.out.println(w4.toString()); //

        System.out.println("Now Adding 4 lbs and 31 oz, New Weight should be 7 lbs and 0 oz");
        w4.add(4, 31);
        System.out.println(w4.toString());

        System.out.println("Now Adding -8 lbs and 0 oz, New Weight should be Invalid");
        w4.add(-8,0);
        System.out.println(w4.toString()); // 7 lbs. 0 oz

        System.out.println("Now Adding -1 lbs and -1 oz, New Weight should be 5 lbs and 15 oz");
        w4.add(-1,-1);
        System.out.println(w4.toString());

        System.out.println("Now Adding -1 lbs and 0 oz, New Weight should be 4 lbs and 15 oz");
        w4.add(-1,0);
        System.out.println(w4.toString());

        System.out.println("Now Adding -4 lbs and 0 oz, New Weight should be 0 lbs and 15 oz");
        w4.add(-4, 0);
        System.out.println(w4.toString());

        System.out.println("Now Adding -1 lbs and 0 oz, New Weight should be Invalid");
        w4.add(-1, 0);
        System.out.println(w4.toString());

        System.out.println("Now Adding 0 lbs and 2 oz, New Weight should be Invalid");
        w4.add(0,-16);
        System.out.println(w4.toString());

        System.out.println("Copying Weight to w5");
        Weight w5 = new Weight(w4);

        System.out.println("w5 should equal w4 which is:" + w5.equals(w4));

        System.out.println("Weight Class Complete");

        /* *** Testing Date Class *** */

        System.out.println("Creating 3 Invalid Dates");
        Date d1 = new Date(1,1,2013);
        Date d2 = new Date( 0,1,2014);
        Date d3 = new Date( 1,0, 2014);

        System.out.println("Creating 1/2/2014 Date");
        Date d4 = new Date(1,2,2014);

        System.out.println("d4 should be 1/2/2014");
        System.out.println(d4.toString());

        System.out.println("d4 should now be 1/3/2014");
        d4.setDay(3);
        System.out.println(d4.toString());

        System.out.println("d4 month should be 1, it is: " + d4.getMonth());
        System.out.println("d4 day should be 3, it is: " + d4.getDay());
        System.out.println("d4 year should be 2014, it is: " + d4.getYear());

        System.out.println("Copying d4 to d5");
        Date d5 = new Date(d4);

        System.out.println("d5 should equal d4 which is: " + d5.equals(d4));

        System.out.println("Date Class Complete");

        /* *** Testing YoungHuman Class *** */

        System.out.println("Creating Jeff Bezos");

        YoungHuman y1 = new YoungHuman(w5, d5, "Jeff", "Bezos");

        System.out.println("The young human is named " + y1.getName());

        System.out.println(y1.toString());

        System.out.println("Adding CheckUpDate");
        y1.setCheckUp(new Date(1,1,2015));

        System.out.println(y1.toString());

        System.out.println("Setting Check Up Date 1/1/2014 before birthDate of 1/3/2014, which should be invalid.");
        y1.setCheckUp(new Date(1,1,2014));

        System.out.println("YoungHuman Class Complete");

        System.out.println("Success!");








    }
}
