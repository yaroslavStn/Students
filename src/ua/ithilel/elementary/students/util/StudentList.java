package ua.ithilel.elementary.students.util;

import ua.ithilel.elementary.students.entities.Student;

import java.util.Arrays;

public class StudentList {

    private Student[] students = new Student[0];

    public void addStudent (Student student) {
        students= Arrays.copyOf(students,students.length+1);
        students[students.length-1]=student;
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void setStudent(Student value, int index) {
        students[index] = value;
    }

    public int size () {
        return students.length;
    }

    public Student [] getStudents (){
        return students;
    }

    public Student[] sortedByName () {

        boolean isSorted = false;
        Student buf;

        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < students.length - 1; j++) {
                String student1 = students[j].getName();
                String student2 = students[j+1].getName();
                int compare = student1.compareToIgnoreCase(student2);
                if (compare > 0) {
                    isSorted = false;
                    buf=students[j];
                    students[j]=students[j+1];
                    students[j+1]=buf;
                }
            }
        }
        return students;
    }
}
