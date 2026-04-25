//Java Program to implement array of objects

class Student {
    String name;
    int age;

    //Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}


class ArrayOfObjects {
    public static void main(String[] args) {
        //Creating an array of Student objects
        Student[] students= {
            new Student("Alice", 20),
            new Student("Bob", 22),
            new Student("Charlie", 21)
        };

        //Displaying student details
        for (Student student : students) {
            student.display();
        }
    }
}