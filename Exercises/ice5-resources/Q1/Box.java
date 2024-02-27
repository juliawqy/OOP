public class Box {
    private int length;
    private int breadth;
    private int height; 

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Object clone() {
        return new Box(this.length, this.breadth, this.height);
    }

    public boolean equals(Object thing1) {
        if (thing1 instanceof Box) {
            Box boxThing = (Box) thing1;
            if (boxThing.length == this.length && boxThing.breadth == this.breadth && boxThing.height == this.height) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        return "height: " + this.height + ", breadth: " + this.breadth + ", length: " + this.length;
    }

}
