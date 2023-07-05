package controller;

import model.Student;
import model.Teacher;
import service.DataServiceImpl;

import java.util.List;

public class Controller {
    DataServiceImpl dataService = new DataServiceImpl();

    public void create(List<Student> studentList, Teacher teacher) {
        if (studentList != null && teacher != null) {
            dataService.create(studentList, teacher);
        }
        else {
            System.out.println("wrong data");
        }
    }

    public void read() {
        dataService.read();
    }
}
