package be.dihertalem.funiversity.domain;

public class Professor {

    private int id;
    private String firstName;
    private String lastName;
    private static int numberOfProfessors;

    public Professor(String firstName, String lastName) {
        this.id = numberOfProfessors;
        this.firstName = firstName;
        this.lastName = lastName;
        numberOfProfessors++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
