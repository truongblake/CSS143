package FileWordSearch;

/**
 * Description: BinarySearch class to test BinarySearch algorithm using dynamic and recursive programming
 * @Author Blake Truong
 * */
public class BinarySearch extends SearchAlgorithm {
    /**
     * Description: searches a given target word within an array of words by using binarySearch implemented through dynamic programming
     * Pre-Condition: wordToFind != null, and words != null and words.length > 0, will throw ItemNotFoundException if wordToFind is not found in words.
     * Post-Condition: returns the index of target wordToFind within array of words
     * @Author Blake Truong
     * */
    @Override
    public int search(String[] words, String wordToFind) throws ItemNotFoundException {
        resetCount();
        int LowIndex = 0;
        int HighIndex = words.length - 1;

        while(LowIndex <= HighIndex){
            incrementCount();
            int MidIndex = (LowIndex + HighIndex)/2;
            if(wordToFind.equals(words[MidIndex])){
                return MidIndex;
            }
            if(wordToFind.compareTo(words[MidIndex]) < 0){
                HighIndex = MidIndex - 1;
            }
            if(wordToFind.compareTo(words[MidIndex]) > 0){
                LowIndex = MidIndex + 1;
            }
        }

        throw new ItemNotFoundException();
    }
    /**
     * Description: searches a given target word within an array of words by using binarySearch implemented through recursive programming
     * Pre-Condition: wordToFind != null, and words != null and words.length > 0, will throw ItemNotFoundException if wordToFind is not found in words.
     * Post-Condition: returns the index of target wordToFind within array of words
     * @Author Blake Truong
     * */
    @Override
    public int recSearch(String[] words, String wordToFind) throws ItemNotFoundException {
        return recSearch(words,wordToFind,0,words.length-1);
    }
    /**
     * Description: overloaded method allow the usage of recursion.
     * searches a given target word within an array of words by using binarySearch implemented through recursive programming
     * Pre-Condition: wordToFind != null, and words != null and words.length > 0, will throw ItemNotFoundException if wordToFind is not found in words.
     * Post-Condition: returns the index of target wordToFind within array of words
     * @Author Blake Truong
     * */
    public int recSearch(String[] words, String wordToFind, int LowIndex, int HighIndex) throws ItemNotFoundException{
        incrementCount();
        int MidIndex = (LowIndex+HighIndex)/2;
        if(wordToFind.equals(words[MidIndex])) {
            return MidIndex;
        }
        if(LowIndex >= HighIndex){
           throw new ItemNotFoundException();
        }
        if(wordToFind.compareTo(words[MidIndex]) < 0){
            return recSearch(words,wordToFind,LowIndex,MidIndex - 1);
        }
        else{
            return recSearch(words,wordToFind,MidIndex + 1,HighIndex);
        }
    }

}
