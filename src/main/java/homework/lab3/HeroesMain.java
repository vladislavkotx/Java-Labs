package homework.lab3;

public class HeroesMain {
    public static void main(String[] args) {
        Hero hero1 = HeroFactory.createHero();
        Hero hero2 = HeroFactory.createHero();
        GameManager.fight(hero1, hero2);
    }
}
