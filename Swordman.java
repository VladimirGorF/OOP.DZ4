public class Swordman extends Warrior{

  

    public Swordman(String name, int healf, Sword sword, WoodenShield woodenShield) {
        super(name, healf, sword, woodenShield);
    }

    @Override
    public String toString() {
        return "Swordman" + super.toString();
    }
    
}
