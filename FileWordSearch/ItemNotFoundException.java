package FileWordSearch;

/**
 * Description: ItemNotFoundException class inheriting from the Exception class
 * @Author Blake Truong
 * */
public class ItemNotFoundException extends Exception {
    /**
     * Description: constructor that calls super class constructor with default string argument
     * Pre-Condition: none
     * Post-Condition: instantiates a ItemNotFoundException with given default message
     * @Author Blake Truong
     * */
    public ItemNotFoundException(){
        super("item not found");
    }
    /**
     * Description: constructor that calls super class constructor with user's string argument
     * Pre-Condition: none
     * Post-Condition: instantiates a ItemNotFoundException with given message
     * @Author Blake Truong
     * */
    public ItemNotFoundException(String message){
        super(message);
    }
}
