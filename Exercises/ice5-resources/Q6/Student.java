import java.util.*;

public class Student implements Comparable<Student> {

    private int age;
    private String name;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public int compareTo(Student o) {

        if (this.name.compareTo(o.getName()) == 0) {
            if (this.age > o.getAge()) {
                return 1;
            }
            else if (this.age < o.getAge()) {
                return -1;
            }
            else {
                return 0;
            }
        }

        return this.name.compareTo(o.getName());
    }

    public String toString() {
        return this.name + " : " + this.age;
    }
    
}
