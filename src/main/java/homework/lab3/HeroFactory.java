package homework.lab3;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class HeroFactory {
    public static Hero createHero () {
        Hero[] list = {new Elf(), new King(), new Knight(), new Hobbit()};
        return list[new Random().nextInt(list.length)];
    }
}
