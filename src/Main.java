import ua.ithilel.elementary.students.UI.ConsoleUI;
import ua.ithilel.elementary.students.controller.StudentsController;
import ua.ithilel.elementary.students.services.StudentService;
import ua.ithilel.elementary.students.util.StudentFactory;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        StudentsController studentsController = new StudentsController(new ConsoleUI(), new StudentService(), new StudentFactory());
        studentsController.addStudent(12);
        studentsController.sortedArray();
        studentsController.sortedArrayByAge();
        studentsController.containsStudent("Вася");
        studentsController.containsStudents("Вася");
    }
}
