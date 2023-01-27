import java.util.Random;

/*
  * оружие - копье
  */
public class Spear extends Arsenal {

    public Spear(int damage) {
        super(damage);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, damage);
    }

    @Override
    public String toString() {
        return String.format("Spear,  damage: %d", damage);
    }

}
