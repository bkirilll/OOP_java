package model;

public class Student extends User{

    private int studentId;

    static int idGenerator = 0;

    public Student(String name, int dateOfBrth, int studentId) {
        super(name, dateOfBrth);
        this.studentId = idGenerator++;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfBrth=" + dateOfBrth +
                '}';
    }
}
