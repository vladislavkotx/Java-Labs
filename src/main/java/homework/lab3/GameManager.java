package homework.lab3;

public class GameManager {
    public static void fight(Hero hero1, Hero hero2) {
        while (true) {
            System.out.println(hero1.kick(hero2));
            System.out.println(hero2.kick(hero1));
            if (!hero1.isAlive() || !hero2.isAlive()) {
                break;
            }
        }
        if (!hero1.isAlive() && !hero2.isAlive()) {
            System.out.println("Double kill. Draw");
            return;
        }
        if (hero1.isAlive()) {
            System.out.println(hero1.getClassName() + ' ' + hero1.getName() + " won");
        } else {
            System.out.println(hero2.getClassName() + ' ' + hero2.getName() + " won");
        }
    }
}
