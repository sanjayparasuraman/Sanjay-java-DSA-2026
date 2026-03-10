package java_oop;

public class Main {

    public static void main(String[] args) {

        Student m1 = new Student("Zodd", 20, 919);
        Student m2 = new Student("Guts", 21, 818);

        m1.displayInfo();
        System.out.println();

        m2.displayInfo();
        System.out.println();

        System.out.println("College: " + Student.getCollegeName());
    }
}
    

