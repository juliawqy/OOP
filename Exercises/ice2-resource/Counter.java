// this is for Q8
public class Counter {

    // private int value;
    private int value = 2; //part A: i mean constructor makes it return 0 so like.. 0 ig.. n for the 5 one like it reinitialises so irdk what the point of this qns is..

    public Counter() {
        this.value = 0; 
        // part B removes this^ line, then ofc it initialises as 2 man
    }

    public Counter(int v) {
        this.value = v;
    }    

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public void increment() {
        ++this.value;
    }

    public void decrement() {
        --this.value;
    }

    public void reset() {
        this.value = 0;
    }

}