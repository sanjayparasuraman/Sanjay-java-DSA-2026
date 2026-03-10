package java_opp;

public class Student {

    String name;
    int age;
    int rollNumber;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "fempto";
        s1.age = 19;
        s1.rollNumber = 199;

        s1.displayInfo();
    }
}