package MyJavaCollectionImplementation;

public class Test {

    public static void main(String[] args){

        ArrayList test = new ArrayList();
        test.insert("1", 2);
        test.insert("2", 3);
        test.insert("3", 0);
        /*
        test.insert("2", 1);
        test.insert("3", 2);
        test.insert("4", 3);
        test.insert("5", 4);
        test.insert("6", 5);
        test.insert("7", 6);
        test.insert("8", 7);
        test.insert("9", 8);
        test.insert("10", 9);
        test.insert("A", 10);
        test.insert("B", 11);
        test.insert("C", 12);
         */
        System.out.println(test.toString());
        //test.remove(-1);
        System.out.println(test.toString());



    }
}
