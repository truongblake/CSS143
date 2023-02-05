package Data_Structures;

/**
 * @Kelvin Le
 * @version 07/12/2022
 */
public class ArrayBasedDataStructuresDriver
{
    public static void main(String[] args) {
        stackTests();
        queueTests();
        arrayListTests();
    }

    private static void arrayListTests() {
        //todo: make more tests here
        ArrayList a = new ArrayList();
        
        a.insert('B', 0);
        a.insert('a',0);
        a.insert('t',1);
        
        System.out.println(a.toString());
        
        while(a.isEmpty() == false) {
            System.out.println(a.remove(0));
        }
        
        System.out.println();
        
        ArrayList carMake = new ArrayList();

        carMake.insert("toyota", 0);
        carMake.insert("lexus", 1);
        carMake.insert("bmw", 2);
        carMake.insert("acura", 3);
        carMake.insert("honda", 4);
        carMake.insert("tesla", 5);
        carMake.insert("ford", 6);

        System.out.println(carMake.toString());

        System.out.println("The lexus brand is a luxury version of toyota, " + (carMake.indexOf("Lexus") + 1)
                + " have said.");
                
        while(carMake.isEmpty() == false) {
            System.out.println(carMake.remove(0));
        }
    }

    private static void queueTests() {
        System.out.print("queue ");
        Queue a = new Queue();
        
        a.enqueue('B');
        a.enqueue('a');
        a.enqueue('t');
        
        System.out.println(a.toString());
        System.out.println("This queue contains " + a.size() + " elements.");

        while(a.isEmpty() == false) {
            System.out.println(a.dequeue());
        }

        
        System.out.println();
        System.out.print("queue ");

        Queue name = new Queue();

        name.enqueue('K');
        name.enqueue('e');
        name.enqueue('l');
        name.enqueue('v');
        name.enqueue('i');
        name.enqueue('n');

        System.out.println(name.toString());

        while(name.isEmpty() == false) {
            System.out.println(name.dequeue());
        }
        System.out.println();

        
    }

    private static void stackTests() {
        //todo: make more tests here
        System.out.print("Stack ");
        Stack a = new Stack();
        
        a.push('B');
        a.push('a');
        a.push('t');
        
        System.out.println(a.toString());
        
        while(a.isEmpty() == false) {
            System.out.println(a.pop());
        }
        System.out.println();

    }
    

}
