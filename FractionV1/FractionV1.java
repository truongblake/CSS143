package FractionV1;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

/**
 * 1. I believe you can't solve this without using arrays, the least number of variables would be 1 array.
 * 2. Yes you can use just one array to solve this, that data type of that array would be a String.
 * 3. If you are talking about composition in the sense of a class containing instances of another class then it
 * would mean that this class is a has-is relationship such as School contains teachers.
 * To implement it you would define your first class then add an instance of another class to the first class which now contains an instance of that class.
 * Like a School class which has a teacher. If you are talking about Inner classes then it still has a has-a relationship but Inner classes gets more access
 * to private fields within the outer class compared to just instances of other classes.
 * 4. The solution that I can think of is dividing the fraction by an incrementing number that starts from 2 then resets back to 2 when the modulo is 0
 * until the number is larger than the numerator and denominator and modulo is not 0. Another one is that you find all the factors of the numerators
 * and denominators then find the GCF that way.*/

public class FractionV1 {

    public static void main(String[] Args){
        File fraction = new File("C:\\Users\\Blake\\IdeaProjects\\CS 143\\src\\CS143\\FractionV1\\fractions.txt");

        int totalFractions = countLinesInFile(fraction);

        String[] fractions = new String[totalFractions];

        int[] fractionCount = new int[totalFractions];

        saveFractions(fraction, fractions,fractionCount);

        printFractions(fractions,fractionCount);
    }

    /**  saveFractions(File file,String[] fractions, int[] fractionCount)
     --------------
     Description: This is an overloaded methods which this method creates a Scanner object with the corresponding file directory then calls saveFractions
     Which actually starts taking the fractions from the file and counts.
     PRE-CONDITION: file must be .txt, an empty String[] and int[];
     POST-CONDITION: mutates String[] and Int[] which now contains fractions and the count for them.
     @author Blake Truong
     @return void
     @parameter file: file is a File
     @parameter fractions: fractions is a String[]
     @parameter fractionCount: fractionCount is an int[]
     * */
    public static void saveFractions(File file,String[] fractions, int[] fractionCount){
        try{

            Scanner text = new Scanner(file);
            saveFractions(fractions,fractionCount,text);

        }catch(FileNotFoundException e){

            System.out.println("File not Found");
            System.exit(1);

        }
    }

    /**
     * saveFractions(String[] fractions, int[] fractionCount, Scanner text)
     --------------
     Description: Save Fractions into two arrays one that counts them and ones that saved all unique fraction.
     PRE-CONDITION: empty String[] fractions and int[] fractionCount, Scanner must contain a file to a .txt.
     POST-CONDITION: mutates String[] and Int[] which now contains fractions and the count for them.
     @author Blake Truong
     @return void
     @parameter fractions: fractions is a String[]
     @parameter fractionCount: fractionCount is an int[]
     @parameter text: text is a Scanner
     */
    public static void saveFractions(String[] fractions, int[] fractionCount, Scanner text){
        while(text.hasNextLine()){

            String reducedFraction = reduceFraction(text.nextLine());

            for(int i = 0; i < fractions.length; i++){
                if(fractions[i] != null && fractions[i].equals(reducedFraction)){
                    fractionCount[i]++;
                    break;
                }
                else if(fractions[i] == null){
                    fractions[i] = reducedFraction;
                    fractionCount[i]++;
                    break;
                }
            }
        }
    }
    /**  printFractions(String[] fractions, int[] fractionCount)
     --------------
     Description: Print out fractions and their corresponding count
     PRE-CONDITION:
     POST-CONDITION:
     @author Blake Truong
     @return void
     @parameter fractions: fractions is an String[]
     @parameter fractionCount: fractionCount is an int[]
     */
    public static void printFractions(String[] fractions, int[] fractionCount){
        for(int i = 0; i < fractions.length; i++){
            if(fractions[i] != null) {
                System.out.println(fractions[i] + " has a count of " + fractionCount[i]);
            }
        }
    }
    /**  reduceFraction(String fraction)
     --------------
     Description: reduceFraction takes a fraction as a String and returns the simplest form of that fraction back as a String.
     PRE-CONDITION: fraction must contain a / to show that a fraction is passed as an argument.
     POST-CONDITION: return simplest form of fraction as a String.
     @author Blake Truong
     @return String
     @parameter fraction: fraction is a String
     */
    public static String reduceFraction(String fraction){

        String[] temp = fraction.split("/");
        int numerator = Integer.parseInt(temp[0]);
        int denominator = Integer.parseInt(temp[1]);
        int gcd = gcd(numerator,denominator);

        return numerator/gcd + "/" + denominator/gcd;
    }
    /**  countLinesInFile(File file)
     --------------
     Description: countLinesInFile counts the number of lines in the Files.
     PRE-CONDITION: file must be a txt file.
     POST-CONDITION: returns an int containing how many lines are in the txt file.
     @author Blake Truong
     @return int
     @parameter file: file is a File.
     */
    public static int countLinesInFile(File file){

        int count = 0;

        try{

            Scanner text = new Scanner(file);

            while(text.hasNextLine()){
                count++;
                text.nextLine();
            }

        }
        catch(Exception FileNotFoundException){

        }

        return count;
    }
    /**  gcd(int a, int b)
     --------------
     Description: gcd searches the greatest common divisor.
     PRE-CONDITION: a and b must be integers.
     POST-CONDITION: return the greatest common divisor as an int.
     @author Blake Truong
     @return int
     @parameter a: a is an int
     @parameter b: b is an int
     */
    public static int gcd(int a, int b){
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b%a != 0){
            a = b%a;
        }
        return a;
    }
}
