package Assignments.SportsTeamRoster;

public class Team {

    public static final int MAX_PLAYERS = 5;

    private String teamName;
    private String coachName;
    private String conferenceName;

    private Person[] team;

    public Team(String teamName, String coachName, String conferenceName){

        numPlayers = 0;
        team = new Person[MAX_PLAYERS];

        this.teamName = teamName;
        this.coachName = coachName;
        this.conferenceName = conferenceName;
    }

    private int numPlayers;

    public void add(Person player){

        team[numPlayers] = player;
        numPlayers++;

    }

    public void find(int jersey){

        for(Person person: team){
            if(person.getJerseyNumber() == jersey){
                System.out.println("Name: " + person.getName());
                System.out.println("Jersey Number: " + person.getJerseyNumber());
            }
        }
    }

    public void reportTeam(){

        for(Person person: team){
            System.out.println("Name: " + person.getName());
            System.out.println("Phone Number: " + person.getPhoneNumber());
            System.out.println("Birth Date: " + person.getBirthDate());
            System.out.println("Jersey Number: " + person.getJerseyNumber());
        }
    }



}
