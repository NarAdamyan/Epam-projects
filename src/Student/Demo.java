package Student;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
//        Գեներացնել 20 ուսանողի ցուցակ պատահական տվյալներով (օգտագործեք մեթոդ նրանց գեներացնելու համար)։
        var studentList = Student.randomList(20);
        System.out.println(studentList);

//        Նրանց տարիքը 18-ից 22-ի սահմաններում է։
        List<Student> ageFilterdStudent = studentList.stream().filter(a -> (a.age > 18 && a.age < 22)).collect(Collectors.toList());
        System.out.println(ageFilterdStudent);

//        Նրանց գնահատականը 60-ից 80-ի սահմաններում է։
        List<Student> gradeFilteredList = studentList.stream().filter(a -> (a.grade > 60 && a.grade < 80)).collect(Collectors.toList());
        System.out.println(gradeFilteredList);

//        Ստեղծել ուսանողների ցուցակ, որոնց գնահատականները բարձրացված են 15%-ով,
//        բայց համոզվել, որ ոչ մի գնահատական չի գերազանցում 80-ը։
        List<Student> validGradesStudent = new ArrayList<>();
        validGradesStudent=studentList.stream().filter(a->a.isGradeValid(Student.increaseGrade(a,15),80)).collect(Collectors.toList());
        System.out.println("not up to 80" +validGradesStudent);

//        Գտնել և հաշվարկել 20 և բարձր տարիք ունեցող ուսանողների միջին գնահատականը։ Արդյունքը մշակել Optional-ով։
        var agedTwenty = studentList.stream().filter(a -> a.age > 20).collect(Collectors.toList());
        double average = agedTwenty.stream().mapToDouble(a -> a.grade).average().orElse(0);
        System.out.println("Age max to 20 grade overage is: " + average);

//        Ստուգել՝ արդյո՞ք բոլոր ուսանողների գնահատականները 45-ից բարձր են, և տպել արդյունքը։
        Predicate<Student> isGraduated = a -> a.grade > 45;
        studentList.stream().forEach(a -> System.out.println(isGraduated.test(a) + " " + a.name));

//      Գտնել ամենացածր գնահատական ունեցող ուսանողին և տպել։
        Student st = studentList.stream().min((Comparator.comparingDouble(s -> s.grade))).orElse(null);
        System.out.println("The lower grade is " + st);

//        Ստեղծել ուսանողների անունների ստորակետերով բաժանված տող, որոնց անունները դասավորված են այբբենական կարգով,
//        և տպել արդյունքը։
        String line = studentList.stream().sorted(Comparator.comparing(Student::getName)).map(Student::getName). // Extract names from Student objects
                collect(Collectors.joining(","));
        System.out.println(line);
        //        Ֆիլտրել և ուսանողներին խմբավորել ըստ գնահատականների (60< , 60 - 70, > 70) և տպել խմբերը։

        Map<String, List<Student>> collectedStudents = studentList.stream()
                .collect(Collectors.groupingBy(s -> {
                    if (s.grade < 60) return "<60";
                    else if (s.grade >= 60 && s.grade < 70) return "60-70";
                    else return ">=70";
                }));
        collectedStudents.forEach((category, student) -> {
            System.out.println(category + ":" + student);
        });
//        Գտնել ամենաերիտասարդ ուսանողին
        Student younger = studentList.stream().min(Comparator.comparingInt(a -> a.age)).orElse(null);
        System.out.println("The younger student is " + younger);


    }

    public static void processStudents(List<Student> list, Consumer<Student> consumer) {
        list.forEach(consumer::accept);
    }
}
