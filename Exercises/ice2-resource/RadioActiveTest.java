public class RadioActiveTest {

    public static double calculateMass(double initialMass, double rateOfDecay, int years) {
        
        Substance substance = new Substance(initialMass, rateOfDecay);
        for (int i = 0; i < years; i++) {
            substance.decayOneYear();
        }

        return substance.getMass();

    }

    public static void main(String[] args) {
        /*
         calculate the final mass of a radioactive substance after 5 years
         when it’s initial mass is 500(gm) and rate of decay is 10 (%),
         */

        double result = calculateMass(500, 10, 5);
        System.out.println("Expected:295.245");
        System.out.println("Actual  :" + result);
    }
}
