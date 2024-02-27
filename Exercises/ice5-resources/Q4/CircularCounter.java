public class CircularCounter extends Counter {

    private int limit;

    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;
    } 

    public void decrement() {
        if (super.getValue() > 0) {
            super.setValue(super.getValue() - 1);
        }
        else {
            super.setValue(limit);
        }
    }

    public void increment() {
        if (super.getValue() < limit) {
            super.setValue(super.getValue() + 1);
        }
        else {
            super.setValue(0);
        }
    }
    
}
