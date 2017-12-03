package test.task44;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Teacher teacher = new Teacher();


        student.setName(sc.nextLine());
        student.setCheerfulness(sc.nextInt()); //бодрость.
        student.setCourse(sc.nextInt());
        student.setSatietly(sc.nextInt()); //сытость
        student.setSubjectLevel(sc.nextInt());
        student.setMotivation(sc.nextInt());

        student.takeExam();
        student.takeAddSession();
    }
}
