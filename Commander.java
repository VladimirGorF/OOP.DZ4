import java.util.ArrayList;
import java.util.List;

public class Commander extends Warrior {
   
    private Team<Warrior> group = new Team<>();

    /*
     * Commander  имеет щит нулевого сопротивления и любое оружие.
     */
    public Commander(String name, int healf, Weapon weapon, HonourShield honourShield, Team<Warrior> group) {
        super(name, healf, weapon, honourShield);
        this.group = group;
    }

    public void addToCommanderGrope(Team team){
        group = team;
    }

    @Override
    public String toString() {
        String result = "Commander:" + super.toString();
        for (Warrior warrior : group) {
            result = result + warrior.toString();
        }

        return result;
    }



}
