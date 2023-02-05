package Assignments.SportsTeamRoster;

public class Person {

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int jerseyNumber;

    public Person(String name, String phoneNumber, String birthDate, int jerseyNumber){

        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.jerseyNumber = jerseyNumber;

    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getJerseyNumber(){
        return this.jerseyNumber;
    }
    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }
    public String getBirthDate(){
        return this.birthDate;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

}
