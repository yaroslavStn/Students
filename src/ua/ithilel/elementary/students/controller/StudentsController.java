package ua.ithilel.elementary.students.controller;

import ua.ithilel.elementary.students.UI.StudentUI;
import ua.ithilel.elementary.students.entities.Student;
import ua.ithilel.elementary.students.util.StudentFactory;
import ua.ithilel.elementary.students.services.StudentService;
import ua.ithilel.elementary.students.util.StudentList;

public class StudentsController {
    private StudentUI ui;
    private StudentService studentService;
    private StudentFactory studentFactory;

    public StudentsController(StudentUI ui, StudentService studentService, StudentFactory studentFactory) {
        this.ui = ui;
        this.studentService = studentService;
        this.studentFactory = studentFactory;
    }

    public void addStudent(int quantity) {
        for (int i = 1; i <= quantity; i++) {
            studentService.addStudent(studentFactory.randomStudent());
        }
    }

    public void sortedArray() {
        studentService.sort();
    }

    public void sortedArrayByAge() {
        studentService.sortByAge();
    }

    public void printer() {
        ui.printHumanList(studentService.getStudentList());
    }

    public void printer(StudentList studentList) {
        ui.printHumanList(studentList);
    }

    public Student containsStudent(String name) {
        return studentService.containsName(name);
    }

    public void containsStudents(String name) {
        StudentList containsStudents = studentService.containsNameList(name);
        ui.printHumanList(containsStudents);

    }


}



