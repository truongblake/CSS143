package Assignments.Pets;

import java.util.ArrayList;
import java.util.Scanner;


class PetStore {	
	public static void main(String args[]) {
		ArrayList<Pet> pets = new ArrayList<Pet>();
		Scanner scanner = new Scanner(System.in);
		String input;
		String name = "";
		Pet aPet = new Pet();
		String coatColor;
		double weight;
		
		while (true) {
			System.out.print("Enter 'c' for cat or 'd' for dog or 's' for sheep or 'p': for pig: ");
			input = scanner.next().toLowerCase();
			
			if (input.charAt(0) == 'c') {
				System.out.println("Enter the name of the cat (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				System.out.println("Enter the cat's coat color: ");
				coatColor = scanner.next();
				aPet = new Cat();
				((Cat) aPet).setCoatColor(coatColor);
			} else if (input.charAt(0) == 'd') {
				System.out.println("Enter the name of the dog (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				System.out.println("Enter the dog's weight: ");
				weight = scanner.nextDouble();
				aPet = new Dog();
				((Dog) aPet).setWeight(weight);
			} else if(input.charAt(0) == 's') {
				System.out.println("Enter the name of the sheep (or STOP to quit): ");
				name = scanner.next();
				break;
			}else if(input.charAt(0) == 'p') {
				System.out.println("Enter the name of the pig (or STOP to quit): ");
				name = scanner.next();
				break;
			}else {
				System.out.println("Invalid choice.");
				continue;
			}
			
			aPet.setName(name);
			pets.add(aPet);
		}
		
		for (Pet pet : pets) {
			System.out.print(pet.getName() + " is a");
			if (pet instanceof Cat)
				System.out.println(" " + ((Cat)pet).getCoatColor() + " cat.");
			else if (pet instanceof Dog)
				System.out.println(" dog that weights " + ((Dog)pet).getWeight() + " pounds.");
			else
				System.out.println("n unknown animal.");
		}
	}	
}
