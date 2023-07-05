package service;

import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImpl implements Service {

    List<Student> studentList;
    Teacher teacher;

    public DataServiceImpl() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void create(List<Student> studentList, Teacher teacher) {
        this.studentList.addAll(studentList);
        this.teacher = teacher;
    }

    @Override
    public void read() {
        System.out.println(teacher);
        for (Student s : studentList) {
            System.out.println("\t" + s);
        }

    }
}
