package FileWordSearch;

import java.io.File;
/**
 * Description:Test Driver for FindFile Class.
 * @Author Blake Truong*/
public class Driver {
    /**
     * Description: main method to test FindFile Class.
     * @Author Blake Truong*/
    public static void main(String[] args){

        System.out.println("Creating fileFind max_number_of_files = 4");
        FindFile fileFind = new FindFile(5);
        try {
            System.out.println("\nSearching for Jeff.docx (1 should exist): ");
            fileFind.directorySearch("Jeff.docx", "C:\\Users\\Blake\\Documents\\Test"); // 1 file exist
            fileFind.printFilesFoundPaths();
            System.out.println("number of files found(should be 1): " + fileFind.getCount());

            System.out.println("\nSearching for Jeff.txt (1 should exist): ");
            fileFind.directorySearch("Jeff.txt","C:\\Users\\Blake\\Documents\\Test"); // 1 file exist
            fileFind.printFilesFoundPaths();
            System.out.println("number of files found(should be 1): " + fileFind.getCount());

            System.out.println("\nSearching for doesnotexist.txt (should not exist): ");
            fileFind.directorySearch("doesnotexist.txt", "C:\\Users\\Blake\\Documents\\Test"); // file does not exist
            fileFind.printFilesFoundPaths();
            System.out.println("number of files found(should be 0): " + fileFind.getCount());

            try {
                System.out.println("\nSearching for Testing.txt (6 should exist, but should throw illegalState Exception): ");
                fileFind.directorySearch("Testing.txt", "C:\\Users\\Blake\\Documents\\Test");// 5
                fileFind.printFilesFoundPaths();
            }catch(IllegalStateException e){
                System.out.println("number of files found exceeded");
                System.out.println("printing location of found files");
                fileFind.printFilesFoundPaths();
                System.out.println(fileFind.getCount());
            }

            System.out.println("Creating new FindFile object with max_number_of_files = 6");
            FindFile fileFind2 = new FindFile(6);
            System.out.println("\nSearching for Testing.txt (6 should exist): ");
            fileFind2.directorySearch("Testing.txt","C:\\Users\\Blake\\Documents\\Test" );// 5 exist although 2 pathname is already in files so max file exceeded
            fileFind2.printFilesFoundPaths();
            System.out.println("number of files found(should be 6): " + fileFind2.getCount());

            System.out.println("\nSearching for invalid_directory.txt (should throw illegalArgument Exception): ");
            fileFind.directorySearch("invalid_directory.txt", "C:\\dsafniuahncsaijuhc"); // throws illegalArgument Exception
            fileFind.printFilesFoundPaths(); // prints all pathname found
            System.out.println("number of files found(should be 0): " + fileFind.getCount());

        }catch(IllegalArgumentException e){
            System.out.println("invalid directory/pathname");

        }catch(IllegalStateException e){
            System.out.println("number of files found exceeded");
            System.out.println("printing location of found files before exiting");
            fileFind.printFilesFoundPaths();
            System.out.println(fileFind.getCount());

        }catch(Exception e){
            System.out.println("Unknown Exception Caught");
        }
        finally{

            System.out.println("exiting the program");
            System.exit(0);
        }
    }
}
