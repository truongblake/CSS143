package Assignments.ResumeBuilder;
import java.util.*;

public class Main {

    private static void main(String[] args) {

        String name = getName();
        String contact = getContactInfo();
        String education = getEducation();
        String work = getWorkExperience();
        String skills = getSkills();

        buildResume(name,contact,education,work,skills);

    }

    public static String getName(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your First Name: ");
        String firstName = userInput.nextLine();

        System.out.println("Enter Your Last Name: ");
        String lastName = userInput.nextLine();

        return firstName + " " + lastName;

    }

    public static String getContactInfo(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your Phone Number: ");
        String phoneNumber = userInput.nextLine();

        System.out.println("Enter Your Email: ");
        String email = userInput.nextLine();

        return email + ", " + phoneNumber;
    }

    public static String getEducation(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter The School You're Attending Currently: ");
        String school = userInput.nextLine();

        System.out.println("Enter Your Major: ");
        String major = userInput.nextLine();

        System.out.println("Enter Your Graduation Year: ");
        String graduationYear = userInput.nextLine();

        return school + ", " + major + ", " + graduationYear;
    }

    public static String getWorkExperience(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Your Work Experience");

        String workExperience = userInput.nextLine();

        return workExperience;
    }

    public static String getSkills(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 3 Skills:");

        String skill1 = userInput.nextLine();
        String skill2 = userInput.nextLine();
        String skill3 = userInput.nextLine();

        return skill1 + ", " + skill2 + ", " + skill3;
    }

    public static void buildResume(String name, String contactInfo, String education, String workExperience, String skills){

        System.out.printf("%s\n",name);
        System.out.printf("Contact Information: %s\n", contactInfo);
        System.out.printf("Education: %s\n", education);
        System.out.printf("Work Experience: %s\n", workExperience);
        System.out.printf("Skills: %s\n", skills);

    }
}
