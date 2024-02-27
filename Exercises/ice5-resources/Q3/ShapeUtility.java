import java.util.*;

public class ShapeUtility {
    
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {

        Octagon result = null;
        Octagon temp;
        double maxArea = 0.0;

        if (shapeList == null || shapeList.size() == 0) {
            return null;
        }

        for (int i=0; i < shapeList.size(); i++) {
            if (shapeList.get(i) instanceof Octagon) {
                temp = (Octagon) shapeList.get(i);
                if (temp.getArea() >= maxArea) {
                    result = temp;
                    maxArea = temp.getArea();
                }
            }
        }

        return result;

    } 

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {

        ArrayList<Shape> returnList = new ArrayList<>();

        if (shapeList == null || shapeList.size() == 0) {
            return returnList;
        }

        Shape temp;

        for (int i=0; i < shapeList.size(); i++) {
            if (!(shapeList.get(i) instanceof Rectangle)) {
                temp = (Shape) shapeList.get(i);
                returnList.add(temp);
            }
        }

        return returnList;
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {

        Square temp;
        ArrayList<Square> returnList = new ArrayList<>();

        if (shapeList == null || shapeList.size() == 0) {
            return returnList;
        }

        for (int i=0; i < shapeList.size(); i++) {
            if (shapeList.get(i) instanceof Square) {
                temp = (Square) shapeList.get(i);
                if (temp.getArea() >= minArea) {
                    returnList.add(temp);
                }
            }
        }

        return returnList;

    }

    public static ArrayList<Rectangle> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {

        Rectangle temp;
        ArrayList<Rectangle> returnList = new ArrayList<>();

        if (shapeList == null || shapeList.size() == 0) {
            return returnList;
        }

        for (int i=0; i < shapeList.size(); i++) {
            if (shapeList.get(i) instanceof Rectangle) {
                temp = (Rectangle) shapeList.get(i);
                if (temp.getLength() >= length) {
                    returnList.add(temp);
                }
            }
        }

        return returnList;

    }


}
