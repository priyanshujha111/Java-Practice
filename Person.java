public public class person {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

// Derived class: Student
class Student extends Person {
    // Additional attribute
    private int grade;

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, int grade) {
        super(name, age); // Call the constructor of the Person class
        this.grade = grade;
    }

    // Method to display grade
    public void study() {
        System.out.println("I am studying for grade: " + grade + ".");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Alice", 16, 10);

        // Calling methods
        student.speak(); // From the Person class
        student.study(); // From the Student class
    }
}
Explanation:
Structure:

Person is the base class.
Student inherits from Person and adds a grade attribute with its own methods.
The Main class contains the main method to test the functionality.
main Method:

Creates a Student object using the constructor, passing the values for name, age, and grade.
Calls the speak() method inherited from the Person class to display the name and age.
Calls the study() method from the Student class to display the grade.
Output:
When you run the program, the output will be:

css
Copy code
My name is Alice and I am 16 years old.
I am studying for grade: 10.











ChatGPT {
    
}
