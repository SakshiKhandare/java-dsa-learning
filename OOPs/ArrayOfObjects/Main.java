package OOPs.ArrayOfObjects;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("Monica",19, 90);
        students[1] = new Student("Andy", 21, 92);
        students[2] = new Student("Harry", 20, 85);

        // Loop through array and display student info
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < students.length; i++) {
            // Directly accessing fields
            System.out.println(
                    students[i].name + " Age: " + students[i].age + ", Marks: " + students[i].marks);
        }
    }
}
