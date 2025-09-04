package OOPs.Constructors;

public class Main  {

    public static void main(String[] args) {

        // Using compiler-provided default constructor:
        // Not possible directly because we defined our own constructors.
        // Instead, we'll use our custom ones:

        Student s1 =  new Student();
        Student s2 = new Student("Alex",19);
        Student s3 = new Student(s2);

        System.out.println("--- Output ---");
        s1.show(); // Default Name - 18
        s2.show(); // Alex - 19
        s3.show(); // Alex - 19 (copied)
    }
}
