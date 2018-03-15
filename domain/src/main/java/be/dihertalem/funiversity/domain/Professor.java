package be.dihertalem.funiversity.domain;

public class Professor {

    private int id;
    private String firstName;
    private String lastName;

    public Professor(String firstName, String lastName) {
        this.id = (int) (Math.random() * 5000 + 1);
        this.firstName = firstName;
        this.lastName = lastName;
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
