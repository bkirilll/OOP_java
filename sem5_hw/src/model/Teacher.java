package model;

public class Teacher extends User{

    private int teacherId;

    static int idGenerator = 0;

    public Teacher(String name, int dateOfBrth, int teacherId) {
        super(name, dateOfBrth);
        this.teacherId = idGenerator++;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", dateOfBrth=" + dateOfBrth +
                '}';
    }
}
