class Student {
    private String name;
    private int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a Student object using the parameterized constructor
        Student student1 = new Student("John", 20);

        // Creating another Student object using the parameterized constructor
        Student student2 = new Student("Alice", 22);

        // Display details of the students
        System.out.println("Student 1 details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 details:");
        student2.displayDetails();
    }
}
