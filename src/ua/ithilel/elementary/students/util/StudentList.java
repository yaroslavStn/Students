package ua.ithilel.elementary.students.util;

import ua.ithilel.elementary.students.entities.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentList {

    private Student[] students = new Student[0];

    public void addStudent(Student student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void setStudent(Student value, int index) {
        students[index] = value;
    }

    public int size() {
        return students.length;
    }

    public Student[] getStudents() {
        return students;
    }


    public Student[] sortedByAge() {

       /* boolean isSorted = false;
        Student buf;

        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < studentList.size()-1; j++) {
                int student1 = studentList.getStudent(j).getAge();
                int student2 = studentList.getStudent(j+1).getAge();

                    if (student1 > student2) {
                    isSorted = false;
                    buf=studentList.getStudent(j);
                    studentList.setStudent(studentList.getStudent(j+1),j);
                    studentList.setStudent(buf,j+1);
                }
            }
        }
        return studentList*/
        Arrays.sort(students);
        return students;
    }

}
