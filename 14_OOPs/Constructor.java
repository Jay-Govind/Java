public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Jay Govind");
        Student s3 = new Student(20);
        Student s4 = new Student("Jay Govind", 20);

        System.out.println(s1.name + " " + s1.age); // null 0
        System.out.println(s2.name + " " + s2.age); // Jay Govind 0
        System.out.println(s3.name + " " + s3.age); // null 20
        System.out.println(s4.name + " " + s4.age); // Jay Govind 20
    }
}

class Student {
    String name;
    int age;

    // Constructor overloading
    Student() {
        System.out.println("Constructor is calling...");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}