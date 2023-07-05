package service;

import model.Student;
import model.Teacher;

import java.util.List;

public interface Service {

    public void create(List<Student> studentList, Teacher teacher);

    public void read();


}
