package FractionV2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BlakeFractionDriver {

    private static void main(String[] args){

        ArrayList<FractionCounter> fractionsCount = new ArrayList<>();

        File fractionsfile = new File("C:\\Users\\Blake\\IdeaProjects\\CS 143\\src\\FractionV2\\fractions.txt");

        saveFractions(fractionsfile, fractionsCount);
        printFractionsCount(fractionsCount);

    }
    /** isUniqueFraction(Iterator<FractionCounter> iterator, ArrayList<FractionCounter> fractionsCount, Fraction fraction)
     * -------
     * Description: Compares a fraction to see if fraction exist within Arraylist of FractionCounter, through the usage of an iterator.
     * Pre-Condition: iterator must be associated with Arraylist fractionsCount.
     * Post-Condition: returns true or false if fraction is being added is unique or not to the array list of FractionCounter
     * @Author Blake Truong
     * @return boolean
     */
    public static boolean isUniqueFraction(Iterator<FractionCounter> iterator, ArrayList<FractionCounter> fractionsCount, Fraction fraction){
        while(iterator.hasNext()){
            if(iterator.next().compareAndIncrement(fraction)){
                return false;
            }
        }
        return true;
    }
    /** saveFractions(File fractionsfile, ArrayList<FractionCounter> fractionsCount)
     * -------
     * Description: a try catch block to Defines a Scanner with directory files location, then calls on an overloaded method
     * saveFractions(ArrayList<FractionCounter> fractionsCount, Scanner text) which will count unique fractions in txt file.
     * Pre-Condition: fractionsfile must be a txt file.
     * Post-Condition: Arraylist fractionsCount will contain fractions and their count from corresponding txt file.
     * @Author Blake Truong
     * @return void
     */
    public static void saveFractions(File fractionsfile, ArrayList<FractionCounter> fractionsCount){
        try{
            Scanner text = new Scanner(fractionsfile);
            saveFractions(fractionsCount, text);
        }catch(FileNotFoundException e){
            System.out.println("Could not Find File");
        }
    }
    /** saveFractions(ArrayList<FractionCounter> fractionsCount, Scanner text)
     * -------
     * Description: Counts the unique fractions from Scanner text and saves it to Arraylist of fractionsCount.
     * Pre-Condition: text file must not contain leading white lines or trailing white lines.
     * Post-Condition: Arraylist fractionCount will contain fractions and their count from corresponding txt file.
     * @Author Blake Truong
     * @return void
     */
    public static void saveFractions(ArrayList<FractionCounter> fractionsCount, Scanner text) {
        while(text.hasNextLine()){

            String[] temp = text.nextLine().split("/",2);

            int numerator = Integer.parseInt(temp[0]);
            int denominator = Integer.parseInt(temp[1]);

            Fraction fraction = new Fraction(numerator,denominator);

            Iterator<FractionCounter> iterator = fractionsCount.iterator();

            if(isUniqueFraction(iterator,fractionsCount,fraction)){
                fractionsCount.add(new FractionCounter(fraction));
            }
        }
    }
    /** printFractionsCount(ArrayList<FractionCounter> fractionsCount)
     * -------
     * Description: prints all the fractions and their count in Arraylist of FractionCounter.
     * Pre-Condition: fractionsCount is initialized.
     * Post-Condition: prints all the fractions and their count in Arraylist of FractionCounter.
     * @Author Blake Truong
     * @return void
     */
    public static void printFractionsCount(ArrayList<FractionCounter> fractionsCount){
        Iterator<FractionCounter> iterator = fractionsCount.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

}
