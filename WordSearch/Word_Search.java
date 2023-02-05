package Assignments.WordSearch;

import java.util.*;

public class Word_Search {

    public static void main(String[] args) {

        System.out.println("Enter Size of the List: ");

        Scanner userInput = new Scanner(System.in);

        while(!userInput.hasNextInt()){ //Verifies if User Enters a Integer.
            userInput.next();
            System.out.println("Not an Integer");
        }

        int listSize = userInput.nextInt();

        String[] list = createList(userInput, listSize); //Creates the User List

        String yesNo;

        do{

            searchWord(userInput, list);

            System.out.println("Would like you search for another word? Yes/No");

            userInput.nextLine();

            yesNo = userInput.nextLine();

            while(!(yesNo.equalsIgnoreCase("Yes") || yesNo.equalsIgnoreCase("No"))){

                System.out.println("Invalid Input, Please Enter Yes or No");
                yesNo = userInput.nextLine();

            }

        } while(yesNo.equalsIgnoreCase("Yes"));





    }

    public static String[] createList(Scanner userInput, int size){

        System.out.println("Please Enter " + size + " Strings");

        String[] list = new String[size];

        for(int i = 0; i < list.length; i++) {

            while (!userInput.hasNext()) {

                System.out.println("Invalid Input, Please Try again");

            }

            list[i] = userInput.next();

        }


        return list;

    }

    public static int searchWord(Scanner userInput, String[] list){

        System.out.println("Please Enter a String you want to search for: ");

        String word = userInput.next();

        int wordCounted = 0;

        for(int i = 0; i < list.length; i++){

            if(list[i].equals(word)){

                wordCounted++;

            }
        }

        if(wordCounted == 0){

            System.out.println(word + " could not be found in the list");
            return 0;

        }else if(wordCounted == 1){

            System.out.println(word + " has been found");
            return 1;

        }
        else{

            System.out.println(word + " has been found a total of " + wordCounted +" times");
            return wordCounted;

        }


    }

}
