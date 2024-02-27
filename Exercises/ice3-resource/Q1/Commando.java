public class Commando extends Soldier {

    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance) {
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;
    }

    public double getGrossAllowance() {
        return this.getBaseAllowance() + vocationAllowance;
    }

    public String toString() {
        return "Commando{Soldier{name='" + this.getName() + "'', baseAllowance=" + this.getBaseAllowance() + "}, vocationAllowance=" + this.vocationAllowance + "}";
    }
    
}

/*NOTE TO SELF 

    when referring to parent class methods need this. else cannot run with no psvm n not foudn in current class

*/
