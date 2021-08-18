package homework.lab3;

import java.util.Random;

public class HeroFactory {
    public static Hero createHero () {
        Hero[] list = {new Elf(), new King(), new Knight(), new Hobbit()};
        return list[new Random().nextInt(list.length)];
    }
}
