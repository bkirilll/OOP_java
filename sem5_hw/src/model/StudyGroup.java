package model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    List<Student> studentGroup;

    protected Teacher teacher;

    public StudyGroup(List<Student> studentGroup, Teacher teacher) {
        this.studentGroup = studentGroup;
        this.teacher = teacher;
    }

    public List<Student> getStudentGroup() {
        return studentGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

}
