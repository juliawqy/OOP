import java.util.*;

public class StudentComparator implements Comparator<Student> {
    
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }

}
