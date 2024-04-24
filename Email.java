
import java.util.*;

class Student {
    String name;
    int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
}

public class Email {
    public static void main(String[] args) {
        // Create some students with their marks
        Student student1 = new Student("Alice", new int[]{80, 75, 90});
        Student student2 = new Student("Bob", new int[]{85, 90, 88});
        Student student3 = new Student("Charlie", new int[]{70, 65, 75});

        // Compare students based on total marks
        int result = Integer.compare(student1.getTotalMarks(), student2.getTotalMarks());

        // Print the comparison result
        if (result < 0) {
            System.out.println(student2.name + " has higher marks than " + student1.name);
        } else if (result > 0) {
            System.out.println(student1.name + " has higher marks than " + student2.name);
        } else {
            System.out.println(student1.name + " and " + student2.name + " have the same marks");
        }
    }
}
