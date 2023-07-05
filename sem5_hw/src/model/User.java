package model;

public abstract class User {
    protected String name;
    protected int dateOfBrth;

    public User(String name, int dateOfBrth) {
        this.name = name;
        this.dateOfBrth = dateOfBrth;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBrth() {
        return dateOfBrth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBrth(int dateOfBrth) {
        this.dateOfBrth = dateOfBrth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dateOfBrth=" + dateOfBrth +
                '}';
    }
}
