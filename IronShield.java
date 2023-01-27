public class IronShield extends Shield {

    public IronShield(int defence) {
        super(defence);
    }

    @Override
    public int Protect() {
        return 60;
    }
    
    @Override
    public String toString() {
        
        return "IronShield, " + super.toString();
    }

}
