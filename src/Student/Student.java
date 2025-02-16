package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    String name;
    int age;
    double grade;
    String birthYear;
    static String[] names = {"Alice", "Bob", "Charlie", "David", "Emma", "Anna", "Ben", "Lusy", "Andrew", "Adam"};

    public Student(String name, int age, double grade, String birthYear) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        name = this.name;
        return this.name;
    }

    public static Student increaseGrade(Student st, int persent) {

        st.grade += st.grade * persent / 100;
        return st;
    }

    public boolean isGradeValid(Student st, int grade) {
        if (grade < 0 || grade > 100 || st.grade >= grade) return false;
        return true;
    }

    @Override
    public String toString() {
        return this.name + " " + this.grade + " " + this.age + " ";
    }

    public static List<Student> randomList(int count) {
        Random random = new Random();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String randomName = names[random.nextInt(names.length)];
            int randomAge = 18 + random.nextInt(20);
            double randomGrade = Math.round((random.nextDouble() * 100) * 10.0) / 10.0;
            studentList.add(new Student(randomName, randomAge, randomGrade));
        }
        return studentList;
    }
}
