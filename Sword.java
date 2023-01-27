import java.util.Random;

public class Sword extends Arsenal {

    public Sword(int damage) {
        super(damage);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, damage);
    }

    @Override
    public String toString() {
        return String.format("Sword,  damage = %d", damage);
    }
    
}
