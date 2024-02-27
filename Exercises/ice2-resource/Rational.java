
public class Rational {

    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Rational(int num, int denom) {
        this.numerator = num;
        this.denominator = denom;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int newVal) {
        this.numerator = newVal;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int newVal) {
        this.denominator = newVal;
    }

    public Rational add(Rational secRational) {
        int newNum = this.numerator*secRational.getDenominator() + this.denominator*secRational.getNumerator();
        int newDenom = this.denominator*secRational.getDenominator();

        return new Rational(newNum, newDenom);

    }

    public Rational subtract(Rational secRational) {

        int newNum = this.numerator*secRational.getDenominator() - this.denominator*secRational.getNumerator();
        int newDenom = this.denominator*secRational.getDenominator();

        return new Rational(newNum, newDenom);
        
    }

    public Rational multiply(Rational secRational) {

        int newNum = this.numerator*secRational.getNumerator();
        int newDenom = this.denominator*secRational.getDenominator();

        return new Rational(newNum, newDenom);
        
    }

    public Rational divide(Rational secRational) {

        int newNum = this.numerator*secRational.getDenominator();
        int newDenom = this.denominator*secRational.getNumerator();

        return new Rational(newNum, newDenom);
        
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

}