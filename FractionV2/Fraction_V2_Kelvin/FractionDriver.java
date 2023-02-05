package FractionV2.Fraction_V2_Kelvin;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.*;

/**
 * Description: FractionDriver to test fractionCounter and Fraction classes
 * @Author Kelvin Le
 */
public class FractionDriver {

    /**Description: Driver for Fractions
     */
    public static void main(String[] args){


        try{
            File fractions = new File("C:\\Users\\Blake\\IdeaProjects\\CS 143\\src\\FractionV2\\fractions.txt");
            Scanner fraction_txt = new Scanner(fractions);

            FractionCounter[] fractionCounters = new FractionCounter[countFractions(fractions)];

            while(fraction_txt.hasNextLine()){
                String[] temp_fraction = fraction_txt.next().split("/");
                int num = Integer.parseInt(temp_fraction[0]);
                int dem = Integer.parseInt(temp_fraction[1]);
                Fraction fraction = new Fraction(num,dem);
                addFraction(fractionCounters, fraction);
            }

            for(int i = 0; fractionCounters[i] != null; i++){
                System.out.println(fractionCounters[i].toString());
            }

        }catch(FileNotFoundException fileNotFound){
            System.exit(0);
        }


    }

    /**Description: counts the number of fractions within a file
     * PRE: fractions is not null
     * POST: returns the number of fractions within file
     */
    public static int countFractions(File fractions){
        int counter = 0;

        try{
            Scanner fraction_txt = new Scanner(fractions);
            while(fraction_txt.hasNextLine()){
                counter++;
                fraction_txt.nextLine();
            }
        }catch(FileNotFoundException fileNotFound){
            System.exit(0);
        }

        return counter;
    }

    /**
     * Description: add a fraction to a FractionCounter array
     * PRE: fraction is not null, fractionCounter is not null
     * POST: adds fraction to the FractionCounter array
     */
    public static void addFraction(FractionCounter[] fractionCounter, Fraction fraction){ // 5/9
        int index = 0;
        if(fractionCounter[index] == null){ // if fractionCounter array is empty create new fraction
            fractionCounter[index] = new FractionCounter(fraction);
            return;
        } //index 0 will be 2/1 index 1 should be 5/9
        while(!fractionCounter[index].compareAndIncrement(fraction)){ //compare [2/1] to [5/9]. now were comparing [5/9] to [5/9] == true
            if(index < fractionCounter.length && fractionCounter[++index] == null){ // [2/1] [5/9] index = 1
                fractionCounter[index] = new FractionCounter(fraction);
                return;
            }
        }
    }
}
