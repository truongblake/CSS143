package Assignments.MultiArray;

import java.util.*;

public class Main{

    private static void main(String[] args) {

	Scanner userInput = new Scanner(System.in);

    start(userInput);

    }

    public static void start(Scanner userInput){

        int[][] multiArray = createMultiArray(userInput);

        boolean exit = true;

        while(exit) {

            System.out.println("What Method would you like to use: createMultiArray, patternRow, patternCheckered, third, userChoice, sumArray, printMultiArray");
            while (!(userInput.hasNext("createMultiArray") ||
                    userInput.hasNext("patternRow")||
                    userInput.hasNext("patternCheckered")||
                    userInput.hasNext("third")||
                    userInput.hasNext("userChoice")||
                    userInput.hasNext("sumArray") ||
                    userInput.hasNext("printMultiArray"))){
                userInput.next();
                System.out.println("Please Enter one of the Methods");
            }

            if(userInput.hasNext("createMultiArray")){
                userInput.next();
                multiArray = createMultiArray(userInput);
            }
            else if(userInput.hasNext("patternRow")){
                userInput.next();
                patternRow(multiArray);
            }
            else if(userInput.hasNext("patternCheckered")){
                userInput.next();
                patternCheckered(multiArray);
            }
            else if(userInput.hasNext("third")){
                userInput.next();
                third(multiArray);
            }
            else if(userInput.hasNext("userChoice")){
                userInput.next();
                userChoice(multiArray,userInput);
            }
            else if(userInput.hasNext("sumArray")){
                userInput.next();
                sumArray(multiArray);
            }
            else if(userInput.hasNext("printMultiArray")){
                userInput.next();
                printMultiArray(multiArray);
            }

            System.out.println("Do you want to Exit the Program? Yes/No");

            while(!(userInput.hasNext("Yes") || userInput.hasNext("No"))){
                userInput.next();
                System.out.println("Please Enter Yes or No");
            }

            if(userInput.hasNext("Yes")){
                exit = false;
            }

            userInput.next();
        }
    }

    public static int[][] createMultiArray(Scanner userInput){ //Not Required Method

        System.out.println("Please Enter How many Rows you want in the Multi Array:");
        int rows = validateIntegerInput(userInput);

        System.out.println("Please Enter How many Columns you want in the Multi Array: ");
        int columns = validateIntegerInput(userInput);

        int[][] multiArray = new int[columns][rows];

        for(int i = 0; i < multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length; j++){
                multiArray[i][j] = 1;
            }
        }

        printMultiArray(multiArray);

        return multiArray;

    }

    public static int validateIntegerInput(Scanner userInput){ //Not required Method
        int positive = 0;
        while(positive <= 0) {

            while (!userInput.hasNextInt()) {
                userInput.next();
                System.out.println("Invalid Input, Please Enter a Positive Integer");
            }

            positive = userInput.nextInt();

            if(positive <= 0){
                System.out.println("Invalid Input, Please Enter a Positive Integer");
            }
        }
        return positive;
    }

    public static void printMultiArray(int[][] multiArray){

        for(int i = 0; i < multiArray.length; i++){

            for(int j = 0; j < multiArray[i].length; j++){

                System.out.printf("%3d",multiArray[i][j]);

            }

            System.out.println("");
        }

        System.out.println("");

    }

    public static void patternRow(int[][] multiArray){

        for(int i = 0; i < multiArray.length; i++){

            for(int j = 0; j < multiArray[i].length; j++){

                if(i%2 == 1){
                    multiArray[i][j] = 1;
                }
                else{
                    multiArray[i][j] = 0;
                }
            }
        }

        printMultiArray(multiArray);
    }

    public static void patternCheckered(int[][] multiArray){

        for(int i = 0; i < multiArray.length; i++){

            for(int j = 0; j < multiArray[i].length; j++){

                if(i%2 == 1){
                    if(j%2 == 1){
                        multiArray[i][j] = 0;
                    }else{
                        multiArray[i][j] = 8;
                    }
                }
                else{
                    if(j%2 == 1){
                        multiArray[i][j] = 8;
                    }else{
                        multiArray[i][j] = 0;
                    }
                }
            }
        }

        printMultiArray(multiArray);

    }

    public static void third(int[][] multiArray){

        for(int i = 0; i < multiArray.length; i++){

            for(int j = 0; j < multiArray[i].length; j++){

                if(i%3 == 0){
                    if(j%3 == 2){
                        multiArray[i][j] = 3;
                    }else{
                        multiArray[i][j] = 0;
                    }
                }else if(i%3 == 1){
                    if(j%3 == 1){
                        multiArray[i][j] = 3;
                    }else{
                        multiArray[i][j] = 0;
                    }

                }else{
                    if(j%3 == 0){
                        multiArray[i][j] = 3;
                    }else{
                        multiArray[i][j] = 0;
                    }
                }
            }
        }

        printMultiArray(multiArray);

    }

    public static void userChoice(int[][] multiArray, Scanner userInput){

        System.out.println("Please Enter 3 digits of your choice: ");
        int num1 =validateIntegerInput(userInput);
        int num2 =validateIntegerInput(userInput);
        int num3 =validateIntegerInput(userInput);


        for(int i = 0; i < multiArray.length; i++){

            for(int j = 0; j < multiArray[i].length; j++){

                if(i%3 == 0){
                    if(j%3 == 2){
                        multiArray[i][j] = num3;
                    }else if(j%3 == 1){
                        multiArray[i][j] = num2;
                    }else{
                        multiArray[i][j] = num1;
                    }
                }else if(i%3 == 1){
                    if(j%3 == 1){
                        multiArray[i][j] = num3;
                    }else if(j%3 == 0){
                        multiArray[i][j] = num2;
                    }else{
                        multiArray[i][j] = num1;
                    }

                }else {
                    if(j%3 == 0){
                        multiArray[i][j] = num3;
                    }else if(j%3 == 1){
                        multiArray[i][j] = num1;
                    }else{
                        multiArray[i][j] = num2;
                    }
                }
            }
        }

        printMultiArray(multiArray);

    }

    public static void sumArray(int[][] multiArray){

        int rowtotal = 0;
        int grandtotal =0;

        for(int i = 0; i < multiArray.length; i++){

            for(int j = 0; j < multiArray[i].length; j++){

                rowtotal += multiArray[i][j];
                grandtotal += multiArray[i][j];

            }
            System.out.println("Row " + i + " has a total of " + rowtotal);
            rowtotal = 0;
        }

        System.out.println("The Grand Total is " + grandtotal);

    }
}
