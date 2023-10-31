
public class static_methods {
	
	static String schoolName = "ABC School"; // A static variable shared by all students

    String studentName; // A non-static variable unique to each student

    public void Student(String name) {
        studentName = name;
    }

    public void displayInfo() {
        System.out.println("Student: " + studentName + " School: " + schoolName);
    }

    public static void main(String[] args) {
    	static_methods student1 = new static_methods();
    	static_methods student2 = new static_methods();

        student1.displayInfo(); // Displays "Student: Alice School: ABC School"
        student2.displayInfo(); // Displays "Student: Bob School: ABC School"
    }
}
