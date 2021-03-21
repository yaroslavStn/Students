package ua.ithilel.elementary.students.services;

import ua.ithilel.elementary.students.entities.Student;
import ua.ithilel.elementary.students.util.StudentList;

public class StudentService {
    private StudentList studentList = new StudentList();

    public void addStudent(Student student) {
        studentList.addStudent(student);
    }

    public StudentList getStudentList() {
        return studentList;
    }

    public StudentList sort() {
        studentList.sortedByName();
        return studentList;
    }


}
