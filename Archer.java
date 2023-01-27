public class Archer extends Warrior {

    public Archer(String name, int healf, Bow bow, GlassShield glassShield) {
        super(name, healf, bow, glassShield);
    }

    @Override
    public String toString() {
        return "Archer" + super.toString();
    }

    public int shotRange(){
        return ((Bow) getWeapon()).getRange();
    }
    
}
