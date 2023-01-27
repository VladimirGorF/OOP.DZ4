/*
 * копьеносец
 */
public class Spearman extends Warrior {

    public Spearman(String name, int healf, Spear spear, Shield ironShield) {
        super(name, healf, spear, ironShield);
    }

    @Override
    public String toString() {
        return "Spearman" + super.toString();
    }
    
}
