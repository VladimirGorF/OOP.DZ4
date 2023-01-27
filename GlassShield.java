public class GlassShield extends Shield {

    public GlassShield(int defence) {
        super(defence);
    }

    @Override
    public int Protect() {
        return 10;
    }

    @Override
    public String toString() {
        return "GlassShield, " + super.toString();
    }
    
}
