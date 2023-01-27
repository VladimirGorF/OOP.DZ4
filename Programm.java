import java.util.List;

// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
// Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
// На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п.
// У лучника добавить поле расстояние поражения. 
// Создать различные виды вооружения, например, меч, лук, лопата.
// Обеспечить, чтобы определенный тип воина мог нести только определенной оружие
// Создать класс командира
// ____________________________________________________

// На основе работы на уроке. Создать класс щита, разработать разные типы щитов, добавить в семейство классов
//  Warriors обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
//   Добавить метод определения минимального щита в команде.
// * Продумать, как можно сделать воина без щита.

public class Programm {
    public static void main(String[] args) {
        Team<Swordman> team1 = new Team<>();
        team1.addToTeam(new Swordman("Ivan", 100, new Sword(50), new WoodenShield(40)))
                .addToTeam(new Swordman("Vasiliy", 110, new Sword(60), new WoodenShield(40)));

                // System.out.println("Team1:");
                for (Swordman swordman : team1) {
                    // System.out.println(swordman);
                }
                System.out.println();

        Team<Archer> team2 = new Team<>();
        team2.addToTeam(new Archer("Violetta", 80, new Bow(30, 45), new GlassShield(10)))
                .addToTeam(new Archer("Elena", 70, new Bow(45, 50), new GlassShield(10)));
                // System.out.println("Team2:");
                for (Archer archer : team2) {
                    // System.out.println(archer);
                }
                System.out.println();

        Team <Warrior> team3 = new Team<>();
        team3.addToTeam(new Swordman("Igor", 100, new Sword(50), new WoodenShield(40)))
        .addToTeam(new Archer("Svetochka", 60, new Bow(30, 80), new GlassShield(10)))
        .addToTeam(new Spearman("Fedor", 110, new Spear(90), new IronShield(60)));

        Commander commander1 = new Commander("Vladimir", 100, new Spear(90), new HonourShield(0),team3);  
        
        // System.out.println("Team3: ");
        // for (Warrior warrior: team3) {
        //     System.out.println(warrior);
        // }

        System.out.println(commander1);  //  имеет щит нулевого сопротивления и любое оружие.

        System.out.printf("Min shield of Team %d\n", team3.minTeamShieldDefence()); 

    }
}
