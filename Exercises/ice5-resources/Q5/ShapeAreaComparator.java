import java.util.*;

public class ShapeAreaComparator implements Comparator<Shape> {
    
    public int compare(Shape o1, Shape o2) {
        if (o1.getArea() > o2.getArea()) {
            return 1;
        }
        else if (o1.getArea() < o2.getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public boolean equals(Object obj) {

        Shape temp;
        Shape currentObj = (Shape) this;

        if (obj instanceof Shape) {

            temp = (Shape) obj;
            if (temp.getArea() == currentObj.getArea()) {
                return true;
            }            
        }
        return false;
    }

}
