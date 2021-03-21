package ua.ithilel.elementary.students.UI;

import ua.ithilel.elementary.students.util.StudentList;

public class ConsoleUI implements StudentUI {

    public void printHumanList(StudentList studentList) {
        System.out.println("\n" +
                "-----Humans-----\n" +
                "");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.print(i + 1 + ") ");
            System.out.println(studentList.getStudent(i));
        }
        System.out.println("-----=====----");

    }
}