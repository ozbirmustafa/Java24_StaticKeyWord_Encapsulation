package day24statickeywordencapsulation;

public class StudentRunner {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.getStdId());
        System.out.println(student.getGpa());
        System.out.println(student.isRetired());

        System.out.println();

        student.setStdId("TM2022HNKS01");
        student.setGpa(3.99);
        student.setRetired(true);
        System.out.println(student.getStdId());
        System.out.println(student.getGpa());
        System.out.println(student.isRetired());

        System.out.println();

        Student student1 = new Student();
        student1.setGpa(3.77);
        System.out.println(student1.getGpa());








    }
}
