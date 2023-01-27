public class HonourShield extends Shield {

    public HonourShield(int defence) {
        super(defence);
    }

    @Override
    public int Protect() {
        return 0;
    }

    @Override
    public String toString() {
        return "HonourShield protects nothing))), " + super.toString();
    }
    
}
