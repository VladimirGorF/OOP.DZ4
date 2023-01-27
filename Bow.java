import java.util.Random;

public class Bow extends Arsenal {
    private int range;

    public Bow(int damage, int range) {
        super(damage);
        this.range = range;
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, damage);
    }

    @Override
    public String toString() {
        return  String.format("Bow: range: %d, damage: %d", range, damage);
    }

    public int getRange() {
        return range;
    }

  
}
