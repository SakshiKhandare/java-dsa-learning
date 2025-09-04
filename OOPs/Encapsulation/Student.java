package OOPs.Encapsulation;

public class Student {

//    Encapsulation is the process of hiding the internal details of a class
//    and allowing controlled access through methods (getters & setters)

//    - Data (fields) are kept PRIVATE.
//    - Public methods (getters/setters) are provided to access/modify data.
//    - Helps in data security, validation, and clean code structure.

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        if(age > 0)
            this.age = age;
        else {
            System.out.println("⚠️ Invalid age, setting default age = 1");
            this.age = 1;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
        else {
            System.out.println("⚠️ Age must be positive.");
        }
    }
}
