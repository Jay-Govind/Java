public class Constructor {
    public static void main(String[] args){
        // Student s1 = new Student("Jay", 15);
        // Student s2 = new Student("Jay", 15);

        Student s3 = new Student();
        Student s4 = new Student();
    }
}
class Student{
    String name;
    int age;

    // Student(String name,int age){
    //     this.name = name;
    //     this.age = age;
    //     System.out.println("Name : " + this.name );
    //     System.out.println("Age : " + this.age);
    // }

    Student(){
        System.out.println("Constructor is called...");
    }
}