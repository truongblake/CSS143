package FileWordSearch;

/**
 * Description: LinearSearch Class to practice implementing linearSearch algorithms by dynamic and recursive methods.
 * @Author Blake Truong
 * */
public class LinearSearch extends SearchAlgorithm{
    /**
     * Description: does a linear search to find target word in given array of words through dynamic programing.
     * Pre-Condition: if wordToFind is not found within array of words then method will throw a ItemNotFoundException;
     * wordToFind != null, and words != null and words.length > 0
     * Post-Condition: return the index of given wordToFind within the Array string of words.
     * @Author Blake Truong
     * */
    @Override
    public int search(String[] words, String wordToFind) throws ItemNotFoundException {
        resetCount();
        for(int i = 0; i < words.length; i++){
            incrementCount();
            if(words[i].equals(wordToFind)){
                return i;
            }
        }
        throw new ItemNotFoundException();
    }
    /**
     * Description: does a linear search to find target word in given array of words through recursion programing.
     * Pre-Condition: if wordToFind is not found within array of words then method will throw a ItemNotFoundException
     * wordToFind != null, and words != null and words.length > 0
     * Post-Condition: return the index of given wordToFind within the Array string of words.
     * @Author Blake Truong
     * */
    @Override
    public int recSearch(String[] words, String wordToFind) throws ItemNotFoundException {
        return recSearch(words, wordToFind,0);
    }
    /**
     * Description: Overloaded method to help linear search to find target word in given array of words through recursion programing.
     * Pre-Condition: if wordToFind is not found within array of words then method will throw a ItemNotFoundException
     * Post-Condition: return the index of given wordToFind within the Array string of words.
     * @Author Blake Truong
     * */
    public int recSearch(String[] words, String wordToFind, int index){ //this method should work although it calls itself to many time that and throws a stackOverFlow Exception
        incrementCount();
        if(words[index].equals(wordToFind)){
            return index;
        }
        return recSearch(words, wordToFind,++index);
    }
}
