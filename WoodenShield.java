public class WoodenShield extends Shield{

    public WoodenShield(int defence) {
        super(defence);
    }

    @Override
    public int Protect() {
        return 40;
    }

    @Override
    public String toString() {
        return "WoodenShield, " + super.toString();
    }
    
}
