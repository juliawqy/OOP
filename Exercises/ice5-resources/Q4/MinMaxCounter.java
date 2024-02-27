public class MinMaxCounter extends Counter {

    private int min;
    private int max;

    public MinMaxCounter(int min, int max) {
        super(min);
        this.min = min;
        this.max = max;
    }
    
    public void decrement() {
        if (super.getValue() > min) {
            super.setValue(super.getValue() - 1);
        }
    }

    public void increment() {
        if (super.getValue() < max) {
            super.setValue(super.getValue() + 1);
        }
    }
    
}
