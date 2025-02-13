package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        Student narine = new Student("Narine", 30, 57.9, "1995");
        Student arman = new Student("Arman", 39, 89.9, "1984");
        Student anna = new Student("Anna", 19, 90.9, "2006");
        Student areg = new Student("Areg", 20, 99.9, "2005");
        List<Student> student = new ArrayList<>();
        student.add(narine);
        student.add(arman);
        student.add(anna);
        student.add(areg);
        System.out.println(student);
        Consumer<Student> consumer = (a) -> System.out.println(a);
        processStudents(student, consumer);
        student.forEach(a -> a.increaseGrade(10));
        System.out.println(student);
        consumer = (a) -> {
            if (a.grade > 90) {
                System.out.println(a);
            }
        };
        processStudents(student, consumer);
    }
    public static void processStudents(List<Student> list, Consumer<Student> consumer) {
        list.forEach(consumer::accept);
    }
}
