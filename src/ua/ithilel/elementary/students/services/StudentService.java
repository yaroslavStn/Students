package ua.ithilel.elementary.students.services;

import ua.ithilel.elementary.students.entities.Student;
import ua.ithilel.elementary.students.util.StudentList;

import java.util.Arrays;

public class StudentService {
    private StudentList studentList = new StudentList();

    public void addStudent(Student student) {
        studentList.addStudent(student);
    }

    public StudentList getStudentList() {
        return studentList;
    }


    public StudentList sortByAge() {
        studentList.sortedByAge();
        return studentList;
    }

    public Student containsName(String name) {
        for (int i = 0; i < studentList.size(); i++) {
            if (name.contains(studentList.getStudent(i).getName())) {
                return studentList.getStudent(i);
            } else if (name.contains(studentList.getStudent(i).getSurname())) {
                return studentList.getStudent(i);
            }
        }
        return null;
    }

    public StudentList containsNameList(String name) {
        StudentList containsNamesList = new StudentList();
        for (int i = 0; i < studentList.size(); i++) {
            if (name.contains(studentList.getStudent(i).getName())) {
                containsNamesList.addStudent(studentList.getStudent(i));
            }
        }
        return containsNamesList;
    }

    public StudentList sort() {

        boolean isSorted = false;
        Student buf;

        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < studentList.size() - 1; j++) {
                String student1 = studentList.getStudent(j).getName();
                String student2 = studentList.getStudent(j + 1).getName();
                int compare = student1.compareToIgnoreCase(student2);
                if (compare > 0) {
                    isSorted = false;
                    buf = studentList.getStudent(j);
                    studentList.setStudent(studentList.getStudent(j + 1), j);
                    studentList.setStudent(buf, j + 1);
                }
            }
        }
        return studentList;
    }


}
