class Student {
    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
    }
    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class Question_3 {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        Student s2 = new Student(101, "John");

        s1.display();
        s2.display();
    }
}
