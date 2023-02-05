package Assignments.SportsTeamRoster;

public class Main {

    private static void main(String[] args) {

        Person jeff = new Person("Jeff", "(206)-291-6742", "January 14, 1923",1);
        Person john = new Person("John", "(206)-123-2146", "March 12, 1954",2);
        Person jim = new Person("Jim", "(206)-876-6542", "April 5, 1927",3);
        Person josh = new Person("Josh", "(206)-754-8312", "June 16, 1957",4);
        Person jack = new Person("Jack", "(206)-534-7234", "July 24, 1976",5);

        Team team = new Team("Jin", "The Eagles", "All-star Conference");

        team.add(jeff);
        team.add(john);
        team.add(jim);
        team.add(josh);
        team.add(jack);

        team.reportTeam();

    }
}
