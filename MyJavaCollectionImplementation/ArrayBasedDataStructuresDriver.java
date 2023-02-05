package MyJavaCollectionImplementation;

public class ArrayBasedDataStructuresDriver {

	public static void main(String[] args) {
		stackTests();
		queueTests();
		arrayListTests();
	}

	private static void arrayListTests() {
		//todo: make more tests here
		System.out.println("\n ArrayList Test \n -----------------------");

		ArrayList a = new ArrayList();

		System.out.println("accessing objects at index -1 and 1 in empty Arraylist a");
		a.get(-1);
		a.get(1);

		System.out.println("inserting invalid index in Arraylist a");
		a.insert('B', 1);
		a.insert('B', -1);

		System.out.println(a.toString());
		System.out.println("size of ArrayList a is: " + a.size());

		System.out.println("inserting 'B' at index 0");
		a.insert('B', 0);
		System.out.println(a.toString());
		System.out.println("size of ArrayList a is: " + a.size());

		System.out.println("inserting 'a' at index 0");
		a.insert('a',0);
		System.out.println(a.toString());
		System.out.println("size of ArrayList a is: " + a.size());

		System.out.println("inserting 't' at index 1");
		a.insert('t',1);
		System.out.println(a.toString());
		System.out.println("size of ArrayList a is: " + a.size());

		System.out.println("inserting 'c' at index 3");
		a.insert('c', 3);
		System.out.println(a.toString());
		System.out.println("size of ArrayList a is: " + a.size());

		System.out.println("inserting null object at index 4");
		a.insert(null, 4);
		System.out.println(a.toString());
		System.out.println("size of ArrayList a is: " + a.size());

		System.out.println("inserting 'z' at index 4");
		a.insert('z', 4);
		System.out.println(a.toString());
		System.out.println("size of ArrayList a is: " + a.size());

		System.out.println("creating copy of Arraylist a to Arraylist b");
		ArrayList b = new ArrayList();
		b.insert('a', 0);
		b.insert('t',1);
		b.insert('B',2);
		b.insert('c',3);
		b.insert('z',4);
		b.insert(null,5);

		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("ArrayList a is equal to Arraylist b: " + a.equals(b));

		System.out.println("inserting null object at index 5 in Arraylist a");
		a.insert(null,5);
		System.out.println(a.toString());
		System.out.println("size of Arraylist a is: " + a.size());

		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("ArrayList a is equal to Arraylist b: " + a.equals(b));

		System.out.println("Checking array can be resize");

		a.insert('o',0);
		a.insert('o',0);
		a.insert('o',0);
		a.insert('o', 0);

		System.out.println("a: " + a.toString());
		
		while(!a.isEmpty()) {
			System.out.println("removing '" + a.remove(0) + "' at index 0");
		}

		System.out.println("stack a is empty: " + a.isEmpty());
		System.out.println("stack a size is " + a.size());

		System.out.println("stack b is empty: " + b.isEmpty());
		System.out.println("stack b size is " + b.size());

		System.out.println("ArrayList Test Complete");
		
	}

	private static void queueTests() {
		//todo: make more tests here
		System.out.println("\n Queue Test \n -----------------------");

		Queue a = new Queue();
		System.out.println("dequeuing Queue a");
		a.dequeue();


		System.out.println("enqueuing null object into queue a");
		a.enqueue(null);
		System.out.println(a.toString());
		System.out.println("size of queue is " + a.size());


		System.out.println("enqueuing 'B' into queue a");
		a.enqueue('B');
		System.out.println(a.toString());
		System.out.println("size of queue is " + a.size());



		System.out.println("enqueuing 'a' into queue a");
		a.enqueue('a');
		System.out.println(a.toString());
		System.out.println("size of queue is " + a.size());


		System.out.println("enqueuing 't' into queue a");
		a.enqueue('t');
		System.out.println(a.toString());
		System.out.println("size of queue is " + a.size());


		System.out.println("creating a copy of queue a as queue b");
		Queue b = new Queue();
		b.enqueue(null);
		b.enqueue('B');
		b.enqueue('a');
		b.enqueue('t');

		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("queue a is equal to queue b: " + a.equals(b));

		System.out.println("enqueuing 'm' into queue a");
		a.enqueue('m');
		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("queue a is equal to queue b: " + a.equals(b));
		
		while(!a.isEmpty()) {
			System.out.println("dequeuing: " + a.dequeue() + " from queue a");
		}
		System.out.println("stack a is empty: " + a.isEmpty());
		System.out.println("stack a size is " + a.size());

		System.out.println("stack b is empty: " + b.isEmpty());
		System.out.println("stack b size is " + b.size());

		System.out.println("Queue Test Complete");

	}

	private static void stackTests() {
		//todo: make more tests here
		System.out.println("\n Stack Test \n -----------------------");

		Stack a = new Stack();

		System.out.println(a.toString());
		System.out.println("Pop Empty stack a");
		a.pop();
		System.out.println("stack size is " + a.size());

		System.out.println("Pushing null into stack a");
		a.push(null);

		System.out.println("inserting 'B' into stack a");
		a.push('B');
		System.out.println(a.toString());
		System.out.println("stack size is " + a.size());

		System.out.println("inserting 'a' into stack a");
		a.push('a');
		System.out.println(a.toString());
		System.out.println("stack size is " + a.size());

		System.out.println("inserting 't' into stack a");
		a.push('t');
		System.out.println(a.toString());
		System.out.println("stack size is " + a.size());

		System.out.println("Creating stack b which equal stack a");
		Stack b = new Stack();
		b.push(null);
		b.push('B');
		b.push('a');
		b.push('t');

		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("Stack b is equal to stack a: " + a.equals(b));

		System.out.println("pushing 'm' into stack b");
		b.push('m');

		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("Stack b is equal to stack a: " + a.equals(b));


		System.out.println("Popping all elements of stack a");
		while(!a.isEmpty()) {
			System.out.println("Popping: '" + a.pop() + "'");
			System.out.println(a.toString());
		}
		System.out.println("stack a is empty: " + a.isEmpty());
		System.out.println("stack a size is " + a.size());

		System.out.println("stack b is empty: " + b.isEmpty());
		System.out.println("stack b size is " + b.size());

		System.out.println("Stack Test Complete");
	}
	

}

