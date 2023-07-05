package model;

public class User {
    private String name;
    private String lastname;
    private long balance;

    public User(String name, String lastname, long balance) {
        this.name = name;
        this.lastname = lastname;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public long getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                '}';
    }
}
