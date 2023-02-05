package FileWordSearch;

import java.io.File;
/**
 * Description: FindFile is an object that will find a specific file given a directory and target filename and type. As well as keep count of how many of those files
 * found up to user's maxFiles that FindFile can find.
 * @Author Blake Truong
 * */
public class FindFile {

    private final String[] files;
    private int numberOfFilesFound;
    /**
     * Description: constructor that instantiates FindFile with given maxFiles.
     * Pre-Condition: maxFiles > 0
     * Post-Condition: FindFile is instantiated with user maxFiles.
     * @Author Blake Truong
     * */
    public FindFile(int maxFiles){
        this.files = new String[maxFiles];
        this.numberOfFilesFound = 0;
    }
    /**
     * Description: resets the number of files found to 0 and creates a file with dirName, then calls on overloaded method directorySearch(String,File), where
     * the recursion happens.
     * Pre-Condition: target must contain Type, dirName must be a directory/path, number of files to be found is < files.length
     * Post-Condition: finds the all files within directory and saves it to this array of files.
     * @Author Blake Truong
     * */
    public void directorySearch(String target, String dirName) throws Exception { //dirName = text files
        File path = new File(dirName);
        numberOfFilesFound = 0;

        if(!path.exists() || !path.isDirectory()){ //
            throw new IllegalArgumentException();
        }

        directorySearch(target,path);
    }
    /**
     * Description: searches the user's directory and target file and saves the path location to this array files.
     * Pre-Condition: target must contain Type, dirName must be a directory/path, number of files to be found is < files.length
     * Post-Condition: saves path location of target to this array files.
     * @Author Blake Truong
     * */
    public void directorySearch(String target, File path) throws Exception{
        if(!path.isDirectory()){ // checks if our path is a file
            if(path.getName().equals(target)) { // checks if file is the file were looking for
                if (numberOfFilesFound + 1 > files.length) { //throws exception if the files we found so far exceeds the number of max files can have.
                    throw new IllegalStateException();
                }
                this.files[numberOfFilesFound++] = path.getAbsolutePath(); //saves the path to our array
            }
            return;
        }
        if(path.listFiles() != null){ //if the directory isn't empty create array list of files within that directory
            for(File file: path.listFiles()){ // call directorySearch on each file/directory
                directorySearch(target,file);
            }
        }
    }

    /**
     * Description: returns the number of Files Found
     * Pre-Condition: none
     * Post-Condition: returns the number of Files found
     * @Author Blake Truong
     * */
    public int getCount(){
        return this.numberOfFilesFound;
    }
    /**
     * Description: returns an array String of our pathfile of target files.
     * Pre-Condition: none
     * Post-Condition: returns an array String of our pathfiles.
     * @Author Blake Truong
     * */
    public String[] getFiles(){
        return this.files;
    }

    /** Helper Method
     * Description: prints Found files path to the stream input.
     * Pre-Condition: none
     * Post-Condition: prints found files path to the stream input.
     * @Author Blake Truong
     * */
    public void printFilesFoundPaths(){
        System.out.println("Pathnames of founded files:");
        String[] filesFound = this.files;
        for (int i = 0; i < numberOfFilesFound; i++) {//prints all pathname of target files found
            if(filesFound[i] != null) {
                System.out.println(filesFound[i]);
            }
        }
    }
}
