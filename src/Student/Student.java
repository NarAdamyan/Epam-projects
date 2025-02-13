package Student;

public class Student {
    String name;
    int age;
    double grade;
    String birthYear;

    public Student(String name, int age, double grade, String birthYear){
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.birthYear=birthYear;
    }
    public void increaseGrade(int persent) {
        this.grade += this.grade*persent/100;
    }
    @Override
    public String toString(){
        return this.name+" "+this.grade+" "+this.age+" "+this.birthYear;
    }
}
